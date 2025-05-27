package io.Properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TraditionWays {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties 文件，并获取相应数据
        BufferedReader buf = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line;
        while ((line=buf.readLine())!=null){
            //获取对应的数据
            String[] split = line.split("=");
            System.out.println(split[0]+"的值为: "+split[1]);
        }

    }
}
