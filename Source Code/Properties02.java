package properties_;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws Exception{
        //使用Properties类来读取mysql.properties 文件
        Properties properties = new Properties();
        //加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        //把k-v显示到控制台
        properties.list(System.out);
        //根据k获得对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名= " + user);
        System.out.println("密码= " + pwd);
    }
}
