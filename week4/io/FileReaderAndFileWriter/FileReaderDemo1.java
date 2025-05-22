package io.FileReaderAndFileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象。
        FileReader reader = new FileReader("C:\\code\\ideaprogram\\ITA_java\\story.txt.txt");
        int bk;
        while ((bk=reader.read())!=-1){//1. 一个一个字符读取（速度慢)
            System.out.print((char) bk);
        }
        reader.close();

    }
    public void readFile01() throws IOException {
        //2.多个字符读取
        char[] c = new char[5];
        int ck;//读取到的字符数。返回-1，读完了
        FileReader reader = new FileReader("C:\\code\\ideaprogram\\ITA_java\\story.txt.txt");
        while ((ck=reader.read(c))!=-1){
            System.out.print(new String(c,0,ck));
        }

    }
}
