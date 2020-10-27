package com.shopee.xiaoshuai.entrytask.util;

import com.shopee.xiaoshuai.entrytask.antlr.ETSqlParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * 工具类，提供一些根据语法树节点以及lineMeta动态生成functional interface对象供Stream使用
 */
public class LogicExpressionUtil {

    private static final Logger logger = LoggerFactory.getLogger("MainLogger");


    /**
     * 处理whereClause
     * @param ctx
     * @param lineMeta
     * @return
     */
    public static Predicate<String> processLogicExpression(ETSqlParser.LogicExpressionContext ctx, Map<String,
            Tuple<Integer,String>> lineMeta){
        Predicate<String> result = null;
        if(ctx.logicalOperator() != null){
            result = processLogicOperator(processLogicExpression(ctx.logicExpression().get(0),lineMeta),
                    ctx.logicalOperator().getText(),
                    processLogicExpression(ctx.logicExpression(1),lineMeta));
        }else {
            result = processConditionExpressionCtx(ctx.conditionExpression(),lineMeta);
        }
        return result;
    }

    /*
    /*processLogicExpression函数的子功能，用于处理逻辑关系
     */
    private static Predicate<String> processLogicOperator(Predicate<String> leftExpression, String logicOperator,
                                                          Predicate<String> rightExpression){
        Predicate result = null;
        switch(logicOperator){
            case "&&":
            case "and":
            case "AND":
                result = leftExpression.and(rightExpression);
                break;
            case "||":
            case "or":
            case "OR":
                result = leftExpression.or(rightExpression);
                break;
            case "!":
            case "not":
            case "NOT":
                result = leftExpression.negate();
        }
        return result;
    }

    /*
    /*processLogicExpression的子功能，用于处理单个的条件比较
     */
    private static Predicate<String> processConditionExpressionCtx(ETSqlParser.ConditionExpressionContext ctx, Map<String, Tuple<Integer,String>> lineMeta){

        logger.debug("Process conditional expression.");
        Predicate<String> result = null;
        String fullColumnName = ctx.fullColumnName().getText();
        String comparisionOperator = ctx.comparisonOperator().getText();
        String value = ctx.value().getText().replaceAll("\"","").replaceAll("\'","").trim();

        logger.debug("condition value:" + value);

        int columnIndex = lineMeta.get(fullColumnName).first;
        String columnType = lineMeta.get(fullColumnName).second;

        if(columnType.equalsIgnoreCase("int")){
            switch(comparisionOperator) {
                case "<":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) < Integer.parseInt(value);
                    break;
                case ">":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) > Integer.parseInt(value);
                    break;
                case "=":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) == Integer.parseInt(value);
                    break;
                case "<=":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) <= Integer.parseInt(value);
                    break;
                case ">=":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) >= Integer.parseInt(value);
                    break;
                case "!=":
                case "<>":
                    result = (String x) -> Integer.parseInt(x.split("\t")[columnIndex]) != Integer.parseInt(value);
                    break;
            }
        }else if(columnType.equalsIgnoreCase("double")){
            switch(comparisionOperator) {
                case "<":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) < Double.parseDouble(value);
                    break;
                case ">":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) > Double.parseDouble(value);
                    break;
                case "=":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) == Double.parseDouble(value);
                    break;
                case "<=":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) <= Double.parseDouble(value);
                    break;
                case ">=":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) >= Double.parseDouble(value);
                    break;
                case "!=":
                case "<>":
                    result = (String x) -> Double.parseDouble(x.split("\t")[columnIndex]) != Double.parseDouble(value);
                    break;
            }
        }else{
            switch(comparisionOperator) {
                case "<":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) < 0;
                    break;
                case ">":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) > 0;
                    break;
                case "=":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) == 0;
                    break;
                case "<=":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) <= 0;
                    break;
                case ">=":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) >= 0;
                    break;
                case "!=":
                case "<>":
                    result = (String x) -> (x.split("\t")[columnIndex]).compareTo(value) != 0;
                    break;
            }
        }

        return result;
    }


    /**
     * 处理简单的select Clause
     * @param elementContexts
     * @param lineMeta
     * @return
     */
    public static Function<String, String> processSelectElement(List<ETSqlParser.SelectElementContext> elementContexts,
                                                                Map<String, Tuple<Integer,String>> lineMeta){

        return  new Function<String,String>(){
            @Override
            public String apply(String s) {
                String[] columns = s.split("\t");
                String resStr = "";
                for(ETSqlParser.SelectElementContext elementContext : elementContexts){
                    String columnName = elementContext.fullColumnName().getText();
                    int columnIndex = lineMeta.get(columnName).first;
                    resStr += columns[columnIndex] + "\t";
                }
                return resStr.trim();
            }
        };
    }


    /**
     * 处理带聚合的select Clause
     * @param elementContexts
     * @param lineMeta
     * @return
     */
    public static Function<String, String[]> processSelectElementWithCallFunc(List<ETSqlParser.SelectElementContext> elementContexts,
                                                                              Map<String, Tuple<Integer,String>> lineMeta){
        logger.debug("Process select element with Call Func.");
        return new Function<String, String[]>() {
            @Override
            public String[] apply(String s) {
                String[] columns = s.split("\t");
                String resStr = "";
                String resNum = "";
                for(ETSqlParser.SelectElementContext elementContext : elementContexts){
                    if(elementContext.fullColumnName() != null){
                        String columnName = elementContext.fullColumnName().getText();
                        int columnIndex = lineMeta.get(columnName).first;
                        resStr += columns[columnIndex] + "\t";
                    }else{
                        String groupingColumnName = elementContext.functionCall().functionArg().getText();
                        resNum = columns[lineMeta.get(groupingColumnName).first];
                    }
                }
                return new String[]{resStr, resNum};
            }

        };
    }


    /**
     * 检查group by的语法正确性，即group by 的字段，等于 select中sum以外的字段
     */

    public static boolean checkGroupBy(ETSqlParser.SelectElementsContext selectElementsContext, ETSqlParser.GroupByCaluseContext groupByCaluseContext){
        logger.debug("Check group by columns.");

        Set<String> groupByColumns = new HashSet<>();
        groupByCaluseContext.groupByItem().forEach(x->groupByColumns.add(x.fullColumnName().getText()));

        Set<String> selectColumns = new HashSet<>();
        selectElementsContext.selectElement().stream().filter(x->x.functionCall() == null)
                .forEach(x->selectColumns.add(x.fullColumnName().getText()));

        return groupByColumns.containsAll(selectColumns) && selectColumns.containsAll(groupByColumns);
    }


}
