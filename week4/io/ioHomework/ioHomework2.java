package ioHomework;

import java.io.*;

public class ioHomework2 {
    public static void main(String[] args) throws IOException {
        String pathname="C:\\code\\ideaprogram\\ITA_java\\story.txt.txt";
        //由于把文件编码方式改为了gbk码,用InputStreamReader 转换
        InputStreamReader isr = new InputStreamReader(new FileInputStream(pathname), "gbk");
        BufferedReader br = new BufferedReader(isr);
        String line;
        int i=0;
        while ((line=br.readLine())!=null){
            ++i;
            System.out.println("行号"+i+" "+line);
        }
        br.close();
    }
}
