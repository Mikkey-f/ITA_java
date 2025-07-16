# JDBC

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612151621553.png" alt="image-20250612151621553" style="zoom: 50%;" />



## 1.入门程序

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612151816306.png" alt="image-20250612151816306" style="zoom:50%;" />

```java
public void testUpdate() throws Exception{
        //1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
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
```



![image-20250612171716609](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612171716609.png)

```java
public void testSelect() {
        String URL = "jdbc:mysql://localhost:3306/web01";
        String USER = "root";
        String PASSWORD = "159849";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // 2. 获取连接
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 3. 创建 Statement 对象
            statement = connection.createStatement();

            // 4. 执行查询
            String sql = "SELECT id, username, password, name, age FROM user WHERE username = 'daqiao' AND password = '123456'";
            resultSet = statement.executeQuery(sql);

            // 5. 处理结果集
            while (resultSet.next()) {
                User01 user = new User01();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getObject("age", Integer.class));

                // 输出用户信息
                System.out.println(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6. 关闭资源
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
```

![image-20250612173821725](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612173821725.png)



## 2.预编译SQL

![image-20250612174123804](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612174123804.png)

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612175531619.png)

![image-20250612175631901](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250612175631901.png)