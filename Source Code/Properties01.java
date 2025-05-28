package properties_;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Properties01 {
    public static void main(String[] args) throws Exception{
        //读取mysql.properties 文件，得到ip， user 和 pwd
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");//split是String的方法
            System.out.println(split[0] + "值是：" + split[1]);
        }

        bufferedReader.close();
    }
}
