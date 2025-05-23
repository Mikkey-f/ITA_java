package io.BufferedReaderAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 {
    public static void main(String[] args) throws IOException {
        //创建BufferedWriter
        //说明:1.new FileWriter("C:\\code\\ideaprogram\\ITA_java\\edu.txt.txt",true）表示以追加的方式写入
        //2.new FileWriter("C:\\code\\ideaprogram\\ITA_java\\edu.txt.txt"）表示以覆盖的方式写入
        BufferedWriter buf1 = new BufferedWriter(new FileWriter("C:\\code\\ideaprogram\\ITA_java\\edu.txt.txt",true));
        buf1.write("hello,hspedu");
        buf1.newLine();//插入一个和系统相关的换行符
        buf1.write("abcde");
        buf1.newLine();
        buf1.close();
        buf1.newLine();
    }
}
