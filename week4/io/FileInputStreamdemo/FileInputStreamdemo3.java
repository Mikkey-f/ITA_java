package io.FileInputStreamdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamdemo3 {
    public static void main(String[] args) throws IOException {
        //练习:拷贝大的文件
        FileInputStream fe=new FileInputStream("C:\\baidunetdiskdownload\\VMware-workstation-full-17.5.0-22583795.exe");
        FileOutputStream fis=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt");
        byte[]bytes=new byte[1024*1024*5];
        int len;
        while ((len=fe.read(bytes))!=-1){
            fis.write(bytes,0,len);//防止发生覆盖现象-->len写入的字符个数.
        }
        fis.close();
        fe.close();
    }
}
