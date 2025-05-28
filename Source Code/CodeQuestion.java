package transformation;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 司志俊
 * @version 1.0
 */
public class CodeQuestion {
    public static void main(String[] args) throws Exception{
        //读取d:\\a.txt 文件到程序
        //默认情况下，读取文件是按照 UTF-8编码
        String filePath = "d:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String s = bufferedReader.readLine();
        System.out.println("读取到的内容: " + s);
        bufferedReader.close();
    }
}
