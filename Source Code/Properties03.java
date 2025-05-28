package properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties 类来创建 配置文件,修改配置文件内容
        Properties properties = new Properties();
        properties.setProperty("charset","utf8");
        properties.setProperty("user","司志俊");//保存时是中文的 unicode码值
        properties.setProperty("pwd","abc111");//创建
        properties.setProperty("user","fy");//修改

        //将k—v 储存在文件中
        properties.store(new FileOutputStream("src\\mysql2.properties"),"司志俊真帅");
        System.out.println("保存配置文件成功~");
    }
}
