package com.shopee.xiaoshuai.entrytask;

import com.shopee.xiaoshuai.entrytask.Listener.MySqlErrorListener;
import com.shopee.xiaoshuai.entrytask.Listener.MySqlListener;
import com.shopee.xiaoshuai.entrytask.antlr.ETSqlLexer;
import com.shopee.xiaoshuai.entrytask.antlr.ETSqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class EntryTaskMain {

    private static final Logger logger = LoggerFactory.getLogger("MainLogger");

    public static void main(String[] args){
        logger.debug("Program Start.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my sql compiler test program");
        System.out.println("Please enter a create statement or select statement to test!");
        System.out.println("Enter \\q to exit !");

        String input_line ;
        while(!(input_line = sc.nextLine()).equalsIgnoreCase("\\q")){

            //Skip empty line.
            if(input_line.trim().length() == 0) {
                continue;
            }

            String sql = input_line;
            Runnable r = new Runnable(){
                @Override
                public void run() {
                    //调用antlr4 自动生成的代码，进行词法和语法的解析
                    CharStream input = CharStreams.fromString(sql);
                    ETSqlLexer lexer = new ETSqlLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    ETSqlParser parser = new ETSqlParser(tokens);

                    //替换掉默认的ErrorListener，因为默认的ErrorListener没有任何处理动作
                    parser.removeErrorListeners();
                    parser.addErrorListener(new MySqlErrorListener());

                    ParseTree tree = parser.sqlstatement();

                    //语法解析报错
                    if(Thread.currentThread().isInterrupted()){
                        System.err.println("语法解析错误，请根据错误信息重新检查输入！");
                    }else{

                        //遍历语法树
                        ParseTreeWalker walker = new ParseTreeWalker();
                        walker.walk(new MySqlListener(),tree);
                    }

                }

            };

            new Thread (r).start();
        }

        logger.debug("Program exiting.");


    }
}
