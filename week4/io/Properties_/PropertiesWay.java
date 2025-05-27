package io.Properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWay {
    public static void main(String[] args) throws IOException {
        //1.创建Properties 对象
        Properties pro = new Properties();
        //2.加载指定配置文件
        pro.load(new FileReader("src\\mysql.properties"));
        //3.把k-v (键-值）显示控制台
        pro.list(System.out);
        //4.根据key 获取对应的值
        String user = pro.getProperty("user");
        String pwd = pro.getProperty("pwd");
        System.out.println("用户名="+user);
        System.out.println("密码="+pwd);
    }
}
