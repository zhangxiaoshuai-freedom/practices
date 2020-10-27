package com.shopee.xiaoshuai.entrytask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args){
        String filePath = "/Users/xiaoshuai.zhang/IdeaProjects/entry-task/./data/table1.data";
        String[] names = {"allen","jane", "joe","Bob","lily"};
        Random random = new Random(0);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));){
            for(int i = 1; i < 100; i++){
                int randomInt = random.nextInt(1000);
                double randomDouble = random.nextDouble()*randomInt;
                String gender = randomInt%2==0?"male":"female";
                String name = names[randomInt%5];
                String age = randomInt%35+"";
                String income = String.format("%.2f",randomDouble);
                String lineText = gender+"\t"+name+"\t"+age+"\t"+income;
                writer.write(lineText);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
