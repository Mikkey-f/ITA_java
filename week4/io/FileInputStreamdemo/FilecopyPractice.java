package io.FileInputStreamdemo;

import java.io.*;

//小文件拷贝
public class FilecopyPractice {
    public static void main(String[] args) throws IOException {
        FileInputStream fe=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        FileOutputStream fs=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt");
        int b;
        //拷贝---->边读边写
        File file=new File("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt");
        while ((b=fe.read())!=-1){
            fs.write(b);
        }
        //释放资源-->先开的最后关闭
        fs.close();
        fe.close();


    }
}
