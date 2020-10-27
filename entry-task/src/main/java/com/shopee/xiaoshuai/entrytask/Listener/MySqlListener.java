package com.shopee.xiaoshuai.entrytask.Listener;

import com.shopee.xiaoshuai.entrytask.antlr.ETSqlBaseListener;
import com.shopee.xiaoshuai.entrytask.antlr.ETSqlParser;
import com.shopee.xiaoshuai.entrytask.util.LogicExpressionUtil;
import com.shopee.xiaoshuai.entrytask.util.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MySqlListener extends ETSqlBaseListener {

    private static final Logger logger = LoggerFactory.getLogger("MainLogger");

    //用于标记执行过程中是否出现错误，方法根据errorState状态决定是否进行业务操作
    private boolean errorState = false;


    private Stream<String> queryStream = null;
    private Map<String, Tuple<Integer,String>> lineMeta = null;
    private Predicate<String> wherePredicate = null;
    private Function<String,String> selectMapper =null;


    /**
     * 进入建表语句时，检查元数据实体是否存在
     * 同时检查表是否已存在
     */
    @Override
    public void enterCreateStatement(ETSqlParser.CreateStatementContext ctx) {
        
        logger.debug("enter create table statement.");

        logger.debug("Check if meta file exists.");
        File metaFile = new File("./data/meta");

        //创建元数据实体
        if(!metaFile.exists()){
            try {
                logger.debug("Meta file doesn't exists, create new meta file: " + metaFile.getAbsolutePath());
                metaFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String tableName = ctx.tableName().getText();

        //检查表是否存在
        logger.debug("Check if tableName:" + tableName +" already exists in database.");
        boolean existsFlag = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(metaFile));){

            String line = null;
            while ((line = reader.readLine()) != null){
                String tableNameInDataBase = line.split("\t")[0];
                if(tableName.equalsIgnoreCase(tableNameInDataBase)){
                    logger.error("Table:" + tableName + "already exists in database, create table failed.");
                    existsFlag = true;
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(!existsFlag){

            File dataFile = new File("./data/"+tableName+".data");
            logger.debug("Create data file:"+ dataFile.getName() +" for table: " + tableName);
            try {
                dataFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            logger.debug("Insert new table metaLine to metaFile.");
            String metaLine = tableName + "\t" + dataFile.getAbsolutePath() + "\t";
            List<ETSqlParser.Column_defContext> columnDefs = ctx.column_defs().column_def();
            for(ETSqlParser.Column_defContext defCxt : columnDefs){
                String columnName = defCxt.fullColumnName().IDENTIFIER().toString();
                String columnType = defCxt.type_name().getChild(0).toString();
                metaLine += columnName + ":" + columnType+",";
            }
            metaLine=metaLine.substring(0,metaLine.length()-1);
            logger.debug("metaLine:" + metaLine);

            try(BufferedWriter writer = new BufferedWriter(new FileWriter(metaFile,true));){
                writer.write(metaLine);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }




    /**
     * 当从tableSource子树退出时，如果tableSource为tableName
     * 设置Stream的源为table的文件
     * 同时设置Stream中元素的元信息
     * @param ctx
     */
    @Override public void exitTableSources(ETSqlParser.TableSourcesContext ctx) {
        logger.debug("Exiting from tableSource subTree.");

        if(errorState){
            return;
        }

        //嵌套查询的情况放在exitsuquery中处理
        if(ctx.subquery() != null){
            return;
        }

        String tableName =ctx.tableName().getText();
        File metaFile = new File("./data/meta");

        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(metaFile));){
            while ((line = reader.readLine()) != null){
                String tableNameInDataBase = line.split("\t")[0];
                if(tableName.equalsIgnoreCase(tableNameInDataBase)){
                    logger.debug("Find Table meta in meta file :" + line );
                    break;
                }
            }
            if(line == null){
                logger.error("Coundn't find meta of Table: " + tableName + "in meta file.");
                errorState = true;
                return;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dataFilePath = line.split("\t")[1];
        String[] columnDefs = line.split("\t")[2].split(",");

        logger.debug("Setting Stream to table File.");
        try {
            queryStream = Files.lines(Paths.get(dataFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.debug("Setting meta of Stream");
        logger.debug("columnDefs values:" + Arrays.toString(columnDefs));
        lineMeta = new HashMap<>();
        for(int i = 0 ; i < columnDefs.length; i++){
            logger.debug("columnDef value:" + columnDefs[i]);
            String[] def = columnDefs[i].split(":");
            lineMeta.put(def[0],new Tuple<>(i,def[1]));
        }

    }

    /**
     * 在退出subquery子树时，将selectStatement中的字段更新为新的lineMeta
     * 并不需要对suquery的结果多做什么，因为suquery的selectStatement结果已经设置为queryStream了
     * @param ctx
     */
    @Override
    public void exitSubquery(ETSqlParser.SubqueryContext ctx) {
        logger.debug("Exiting subquery statement.");

        //如果子查询的selectElements是* lineMeta不变
        if(ctx.selectStatement().selectElements().getText().equals("*")){
            return;
        }

        //获取subquery中映射的Column
        List<ETSqlParser.SelectElementContext> elementsContext = ctx.selectStatement().selectElements().selectElement();

        Map<String, Tuple<Integer,String>> newLineMeta = new HashMap<>();
        for(int i = 0; i < elementsContext.size(); i++){
            ETSqlParser.SelectElementContext elementContext = elementsContext.get(i);

            String newColumnName = "";
            String newColumnType ="";
            String oldColumnName = "";

            //判断是否有AS 重命名列
            if(elementContext.AS_SYMBOL() != null){
                newColumnName = elementContext.uid().getText();

                //判断是否函数
                if(elementContext.functionCall() != null){
                    oldColumnName = elementContext.functionCall().functionArg().getText();
                }else{
                    oldColumnName = elementContext.fullColumnName().getText();
                }

            }else{
                newColumnName = elementContext.fullColumnName().getText();
                oldColumnName = newColumnName;
            }
            newColumnType = lineMeta.get(oldColumnName).second;

            logger.debug("Putting info:" + newColumnName + ":" + i + ":" + newColumnType +"into new lineMeta");
            newLineMeta.put(newColumnName,new Tuple<>(i,newColumnType));
        }

        logger.debug("Replace table line meta with subquery line meta.");
        lineMeta=newLineMeta;

    }



    /**
     * 当退出where clause时，将predicate应用到stream上
     * @param ctx
     */
    @Override
    public void exitWhereClause(ETSqlParser.WhereClauseContext ctx) {
        logger.debug("Exiting where clause.");
        wherePredicate = LogicExpressionUtil.processLogicExpression(ctx.logicExpression(),lineMeta);
        queryStream = queryStream.filter(wherePredicate);
    }


    /**
     * 处理select clause中的映射
     * @param ctx
     */
    @Override
    public void exitSelectStatement(ETSqlParser.SelectStatementContext ctx){
        logger.debug("Exiting selectStatement.");

        if(errorState){
            return;
        }

        //selectClause 为 *
        if(ctx.selectElements().getText().equals("*")){
            selectMapper = (x) -> x;
            //将selectMapper应用到Stream
            queryStream = queryStream.map(selectMapper);
            return;
        }

        //首先判断查询语句中是否包含聚合函数
        boolean notContainAggreFunc = ctx.selectElements().selectElement().stream().allMatch(x -> x.functionCall() == null);

        List<ETSqlParser.SelectElementContext> elementContexts = ctx.selectElements().selectElement();
        //如果没有聚合函数
        if(notContainAggreFunc){
            selectMapper=LogicExpressionUtil.processSelectElement(elementContexts,lineMeta);
            //将selectMapper应用到Stream
            queryStream = queryStream.map(selectMapper);
            return;
        }



        //selectClause中有聚合函数，分两种情况
        //selectClause中仅有SUM函数
        if(ctx.selectElements().selectElement().size() ==1){
            String columnName = ctx.selectElements().selectElement(0).functionCall().functionArg().getText();
            int columnIndex = lineMeta.get(columnName).first;
            String columnType = lineMeta.get(columnName).second;
            if(columnType.equalsIgnoreCase("int")){
                queryStream=Stream.of(queryStream.map(x -> Integer.parseInt(x.split("\t")[columnIndex])).reduce((a,b) -> a+b).get()+"");
            }else if(columnType.equalsIgnoreCase("double")){
                queryStream=Stream.of(queryStream.map(x -> Double.parseDouble(x.split("\t")[columnIndex])).reduce((a,b) -> a+b).get()+"");
            }else{
                logger.error("Columns of Type string doesn't support SUM function.");
                errorState = true;
            }
            return;
        }


        //selectClause中还有其他列，即group by的情况
        logger.debug("Sum with group by clause.");

        //检查语法
        if(!(LogicExpressionUtil.checkGroupBy(ctx.selectElements(),ctx.groupByCaluse()))){
            logger.error("Group By Columns is not right.");
            errorState = true;
            return;
        }
        String functionColumnName = ctx.selectElements().selectElement().stream().filter(x->x.functionCall() != null).collect(Collectors.toList()).get(0).functionCall().functionArg().getText();
        String functionColumnType = lineMeta.get(functionColumnName).second;
        logger.debug("Sum column name:" + functionColumnName +"\t sum column type:" + functionColumnType);

        Function<String,String[]> funcSelectMapper = LogicExpressionUtil.processSelectElementWithCallFunc(elementContexts,lineMeta);
        logger.debug("start processing group.");
        if(functionColumnType.equalsIgnoreCase("int")){
            logger.debug("int branch");
            Map<String,Integer> resultMap = new HashMap<>();
            queryStream.map(funcSelectMapper).forEach(x->resultMap.compute(x[0],(k,v) -> (v == null)?Integer.parseInt(x[1]):v+Integer.parseInt(x[1])));
            queryStream=resultMap.entrySet().stream().map(x->x.getKey()+"\t"+x.getValue());
        }else if(functionColumnType.equalsIgnoreCase("double")){
            logger.debug("double branch");
            Map<String,Double> resultMap = new HashMap<>();
            queryStream.map(funcSelectMapper).forEach(x->resultMap.compute(x[0],(k,v)->(v == null)?Double.parseDouble(x[1]):v+Double.parseDouble(x[1])));
            queryStream=resultMap.entrySet().stream().map(x->x.getKey()+"\t"+x.getValue());
        }else{
            logger.error("Columns of Type string doesn't support SUM function.");
            errorState = true;
        }
        return;


    }


    /**
     * 如果是查询语句，将Stream进行打印，
     * 如果是建表语句，无需任何动作
     * @param ctx
     */
    @Override
    public void exitSqlstatement(ETSqlParser.SqlstatementContext ctx) {
        if(ctx.selectStatement() != null){
            queryStream.forEach(x->System.out.println(x));
        }
    }
}


