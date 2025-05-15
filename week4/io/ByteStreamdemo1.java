package io;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamdemo1 {
    public static void main(String[]args) throws IOException {
        //字节输出流 FileOutputStream
        //写出一段文字到本地文件中。
        /**
         * 实现步骤:
         *      1.创建对象
         *         细节1:参数是字符串表示的路径或者是File对象表示的路径都可以
         *         细节2:如果文件不存在会创建一个新的文件，但要保证父级路径存在
         *         细节3:如果文件已经存在,则会清空文件。(若文件中已有abc,write后变为a)
         *      2.写出数据
         *         细节:write方法的参数是整数,但实际写入文件中的是数字在ASCII上对应的字符
         *      3.释放资源
         *        每次使用完流后都要释放资源
         *
         */
        //1.写出输出流 OutputStream   本地文件  File
        FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //FileOutputStream fe1=new FileOutputStream(new File("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt"));
        fe.write(97);//文件中出现a
        fe.close();//释放资源。
    }
}
