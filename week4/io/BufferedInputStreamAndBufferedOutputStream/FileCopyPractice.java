package io.BufferedInputStreamAndBufferedOutputStream;
//BufferedInputStream和BufferedOutputStream可操作二进制文件
import java.io.*;

public class FileCopyPractice {
    public static void main(String[] args) throws IOException {
        byte[]b=new byte[1024*5];
        //FileInputStream是InputStream的子类
        BufferedInputStream iput = new BufferedInputStream(new FileInputStream("C:\\Users\\23139\\OneDrive\\Pictures\\1BBAFEED9572DE53611C14323B653521.jpg"));
        BufferedOutputStream oput = new BufferedOutputStream(new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\k.jpg"));
        int len;
        //循环读取文件并写入
        while ((len=iput.read(b))!=-1){
            oput.write(b,0,len);
        }
        //关闭节点流
        iput.close();
        oput.close();
    }
}
