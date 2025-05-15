package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamdemo2 {
    public static void main(String[]args) throws IOException {
        //FileOutputStream写数据的三种方式。
        //1.void write(int b) 一次写一个字节数据
        //2.void write(byte[] b) 一次写一个字节数组数据、
        //3.void write(byte[]b,int off,int len) 一次写一个字节数组的部分数据

        //FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //1.
        //fe.write(97);//a

        //2.
        //byte[]ss={97,98,99,100,101};
        //fe.write(ss);//abcde

        //3.off:起始索引 len:个数
        //fe.write(ss,1,3);//bcd

        /**
         *   换行写:windows:\r\n
         *        linux:\n
         *        mac:\r
         *        细节:java在windows中可以只写\r或\n的其中一个。
         *
         *   续写:
         *        打开续写开关即可。
         *        开关位置:创建对象的第二个参数
         *        默认false：表示关闭续写,此时创建对象会清空文件
         *        手动传递true,表示打开续写
         */
        FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt",true);

        String n="\r\n";
        byte[] bytes1 = n.getBytes();
        String s="orzorzorz";
        byte[] bytes = s.getBytes();
        String ss="114514";
        byte[] bytes2 = ss.getBytes();
        fe.write(bytes);
        fe.write(bytes1);
        fe.write(bytes2);

        fe.close();
    }
}
