package io.TryCatchMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchdemo1 {
    public static void main(String[] args) {
        FileInputStream fe=null;
        FileOutputStream fis=null; //手动释放资源
        try {
           fe=new FileInputStream("C:\\baidunetdiskdownload\\VMware-workstation-full-17.5.0-22583795.exe");
           fis=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt");
            byte[]bytes=new byte[1024*1024*5];
            int len;
            while ((len=fe.read(bytes))!=-1){
                fis.write(bytes,0,len);
            }
                                   //可能出现异常的代码
        } catch (IOException e) { //异常的处理代码
            throw new RuntimeException(e);
        } finally {               //执行所有资源释放的操作。
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fe!=null){
                try {
                    fe.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
