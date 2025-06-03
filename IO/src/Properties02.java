import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) {
        //创建
        Properties properties=new Properties();
        //加入键值对
        properties.setProperty("User","Tom");
        //设定存到哪里
        try {
            properties.store(new FileWriter("src\\mysql02.properties"),"没什么想说的");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        properties.setProperty("User","LJW");
        try {
            properties.store(new FileWriter("src\\mysql02.properties"),"没什么想说的");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
