package io.printStreamAndprintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter_ {
    public static void main(String[] args) throws IOException {
        String filepath="C:\\code\\ideaprogram\\ITA_java\\ctl.txt";
       // PrintWriter printWriter = new PrintWriter(System.out);
       PrintWriter printWriter = new PrintWriter(new FileWriter(filepath));
       printWriter.print("hi,北京你好");
       printWriter.close();//flush+关闭流，才能数据写入。
    }
}
