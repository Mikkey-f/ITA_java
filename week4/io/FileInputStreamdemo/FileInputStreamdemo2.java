package io.FileInputStreamdemo;
// FileInputStream一次读多个字节

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//1.public int read(byte[] buffer)  一次读一个字节数组数据
//注意:一次读一个字节数组数据,每次读取会尽可能把数组装满 1024的整数倍
public class FileInputStreamdemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fe=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        byte[]bytes=new byte[2];
        //一次读取多个字节数据,具体读多少,跟数组的长度有关,读取后存在数组中(*)
        //返回值:本次读取到了多少个字节数据
        int len1=fe.read(bytes);
        System.out.println(len1);//2

        String str=new String(bytes);
        System.out.println(str);//ab

        int len2=fe.read(bytes);
        System.out.println(len2);//2

        String str1=new String(bytes);
        System.out.println(str1);//cd

        int len3=fe.read(bytes);
        System.out.println(len3);//2

        String str2=new String(bytes);
        System.out.println(str2);//ed-->将str1中的cd中的c换为e
        fe.close();
    }
}
