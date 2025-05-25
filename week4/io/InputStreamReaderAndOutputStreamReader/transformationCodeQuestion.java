package io.InputStreamReaderAndOutputStreamReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//中文乱码问题
public class transformationCodeQuestion {
    public static void main(String[] args) throws IOException {
        //1.用BufferedReader对象读取文件
        //2.默认情况下读取文件是按照 UTF-8编码
        String filename="C:\\code\\ideaprogram\\ITA_java\\q.txt";
        //出现乱码的原因: 未指定转换方式
        BufferedReader rea = new BufferedReader(new FileReader(filename));
        String s = rea.readLine();
        System.out.println(s);
        rea.close();
    }
}
