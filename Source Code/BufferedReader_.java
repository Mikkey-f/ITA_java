package reader_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 司志俊
 * @version 1.0
 * 演示BufferedReader
 */
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {

        String filePath = "d:\\Hello.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String ling;//按行读取
        //bufferedReader.readLine() 按行读取,返回空表示读取结束
        while ((ling = bufferedReader.readLine()) != null) {
            System.out.println(ling);
        }

        //只需要关闭bufferedReader，底层会自动关闭节点流
        bufferedReader.close();
    }
}
