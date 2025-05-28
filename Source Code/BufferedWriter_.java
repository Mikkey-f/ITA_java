package writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author 司志俊
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\ok.txt";
        //new FileWriter(filePath,true) 追加
        //new FileWriter(filePath) 覆盖
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,帅帅的司志俊");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello,帅帅的司志俊2");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello,帅帅的司志俊3");

        //关闭bufferedWriter即可，new FileWriter(filePath)在底层被关闭
        bufferedWriter.close();
    }
}
