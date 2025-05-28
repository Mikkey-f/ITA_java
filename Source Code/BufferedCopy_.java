package writer_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 司志俊
 * @version 1.0
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws Exception{

        //1.BufferedWriter和BufferedReader 是按照字符读取的
        //不要去操作 二进制文件 可能造成文件损坏
        String srcFilePath = "d:\\Hello.java";
        String destFilePath = "d:\\hello1.java";
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        String line;

        bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            //换行符
            bufferedWriter.newLine();
        }

        if (bufferedWriter != null){
            bufferedWriter.close();
        }
        if (bufferedReader != null){
            bufferedReader.close();
        }
    }
}
