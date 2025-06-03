import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class Properties01 {
    public static void main(String[] args) {
        //1创建Properties对象
        Properties properties=new Properties();
        try {
            //2从哪个文件加载
            properties.load(new FileReader("src\\mysql.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            //3指定写入哪里
            PrintWriter printWriter=new PrintWriter("d:\\test01.txt");
            properties.list(printWriter);
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //4根据值查找对应的键
        System.out.println(properties.getProperty("Ip"));
    }
}
