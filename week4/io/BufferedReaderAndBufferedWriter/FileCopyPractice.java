package io.BufferedReaderAndBufferedWriter;

import java.io.*;
//说明:1.BufferedReader和BufferedWriter是按照字符来操作的,所以不要操作二进制文件[声音,视频等....]，否则可能会造成文件损坏
public class FileCopyPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader rea=new BufferedReader(new FileReader("C:\\code\\ideaprogram\\ITA_java\\edu.txt.txt"));
        BufferedWriter wrt=new BufferedWriter(new FileWriter("C:\\code\\ideaprogram\\ITA_java\\apl,txt.txt"));
        String line;
        while ((line= rea.readLine())!=null){
            wrt.write(line);
            wrt.newLine();
        }
        if(rea!=null) rea.close();
        if(wrt!=null) wrt.close();
    }
}
