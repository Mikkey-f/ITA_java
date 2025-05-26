package io.InputStreamReaderAndOutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//演示 OutputStreamWriter的使用
//指定处理的编码形式 gbk/utf-8/utf8
public class OutputStreamWriter1 {
    public static void main(String[] args) throws IOException {
         String Filepath="C:\\code\\ideaprogram\\ITA_java\\eps.txt";
         String charSet="gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(Filepath), charSet);
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("按照 "+charSet+" 保存文件成功");
    }
}
