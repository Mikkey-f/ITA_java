package ioHomework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ioHomework1 {
    public static void main(String[] args) throws IOException {
        String pathname="C:\\code\\ideaprogram\\ITA_java\\mytemp";
        File f = new File(pathname);
        if(!f.exists()){
            //创建
            if(f.mkdirs()){
                System.out.println("创建"+pathname+"成功");
            }else {
                System.out.println("创建"+pathname+"失败");
            }
        }
        String pathname1=pathname+"\\hello.txt";//pathname+"\\hello.txt"
        File f1=new File(pathname1);
        if(f1.exists()){
            System.out.println(pathname1+"已存在,不需要重复创建了");
        }else{
            f1.createNewFile();//创建新文件。
            //如果创建成功,用BufferedWriter 字符输出流写入内容
            BufferedWriter br = new BufferedWriter(new FileWriter(pathname1));
            br.write("hello,world!");
            br.close();
        }

    }
}
