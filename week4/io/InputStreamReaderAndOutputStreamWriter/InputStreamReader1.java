package io.InputStreamReaderAndOutputStreamWriter;

import java.io.*;

//利用InputStreamReader解决中文乱码问题。
//将字节流 FileInputStream 转换成字符流 InputStreamReader, 指定编码方式
public class InputStreamReader1 {
    public static void main(String[] args) throws IOException {
        String filename="C:\\code\\ideaprogram\\ITA_java\\q.txt";

        //1.把FileInputStream 转换成 InputStreamReader
        //2.编码指定为gbk.
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filename), "gbk");
       //3.把InputStreamReader 传入 BufferedReader
        BufferedReader buf = new BufferedReader(isr);
        //4. 读取
        String s=buf.readLine();
        System.out.println("读取内容: "+s);//不会出现乱码
        isr.close();
    }
}
