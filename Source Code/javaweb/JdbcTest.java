package com.szj;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTest {
    @Test
    public void testUpdate() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "159849";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.获取SQL语句对象
        Statement statement = connection.createStatement();

        //4.执行SQL语句
        int i = statement.executeUpdate("update user set age = 25 where id = 1");
        System.out.println("sql执行完毕影响的记录数为：" + i);

        //5.释放资源
        statement.close();
        connection.close();
    }

}
