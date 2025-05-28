# Properties

## 一.引入

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528171315269.png" alt="image-20250528171315269" style="zoom:67%;" />

传统方法：

```java
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
```





## 二.介绍

### 1.

Properties 的父类是 Hashtable，底层就是Hashtable

![image-20250528185713562](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528185713562.png)



### 2.常用方法

![image-20250528185830867](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528185830867.png)



### 3.案例

![image-20250528190027751](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528190027751.png)

#### 3.1 读取

```java
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
```



#### 3.2 添加和修改

```java
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
```

