package transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * @author 司志俊
 * @version 1.0
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转换成字符流 InputStreamReader ，指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\a.txt";
        //1.把FileInputStream 转成 InputStreamReader
        //2.指定编码 gbk
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //3.把InputStreamReader 传入 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //将2和3合起来
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));

        //4. 读取
        String s = bufferedReader.readLine();
        System.out.println("读取内容：" + s);
        bufferedReader.close();
    }
}
