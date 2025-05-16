package io.FileInputStreamdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamdemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输入流对象 细节:如果文件不存在,直接报错
        FileInputStream fe=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //2.读取数据 细节1:一次只读一个字节   细节2:读到文件末尾,read方法返回-1.
        int b = fe.read();//111:o 只读一个

        System.out.println((char) b);//o 转换


        fe.close();
        //循环读取
        FileInputStream fs=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        int bk;
        while ((bk=fs.read())!=-1){
            System.out.print((char)bk);
        }
        fs.close();
    }
}
