package io.TryCatchMethod;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryCatchdemo2 {
    public static void main(String[] args) {
              //1 try...catch异常处理（接口:AutoCloseable)   JDK7方案 //资源用完后自动释放
        /**
         *   try(创建流对象1;创建流对象2){
         *
         *   }catch(异常类名 变量名){
         *
         *   }
         *   //2.JDK9 创建流对象1; 创建流对象2;  try(流1;流2)
         */
        try(FileInputStream fe=new FileInputStream("C:\\baidunetdiskdownload\\VMware-workstation-full-17.5.0-22583795.exe");
        FileOutputStream fis=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt")) {

            byte[]bytes=new byte[1024*1024*5];
            int len;
            while ((len=fe.read(bytes))!=-1){
                fis.write(bytes,0,len);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     }

}
