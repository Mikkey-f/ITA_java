package io.Properties_;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWay2 {
    public static void main(String[] args) throws IOException {
        //使用Properties类来创建配置文件, 修改配置文件内容
        Properties properties = new Properties();

        //创建
        //如果该文件没有key, 就是创建
        //2.如果该文件有key, 就是修改。
        /*
               Properties 父类是 Hashtable, 底层就是Hashtable 核心方法:如果 key存在，
               就替换; 如果是新key, 就addEntry.

         */
        properties.setProperty("user","汤姆");//保存中文时，字节流是中文的unicode码值.
        properties.setProperty("pwd","123456");
        properties.setProperty("charSet","utf8");
        properties.setProperty("pwd","114514");
        //将k-v保存到文件中.
        properties.store(new FileWriter("week4andweek5\\mysql.properties2"),null);//第二个参数的作用:注释
        System.out.println("保存文件配置成功!");
    }
}
