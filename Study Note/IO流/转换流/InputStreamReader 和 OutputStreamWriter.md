# InputStreamReader 和 OutputStreamWriter



## 一.介绍

![image-20250528155655179](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528155655179.png)

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528160118044.png" alt="image-20250528160118044" style="zoom: 80%;" />

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528160337163.png" alt="image-20250528160337163" style="zoom:80%;" />





## 二.案例

![image-20250528162034500](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528162034500.png)

```java
/**
 * @author 司志俊
 * @version 1.0
 * 演示使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转换成字符流 InputStreamReader ，指定编码 gbk/utf-8
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\a.txt";
        //1.把FileInputStream 转成 InputStreamReader
        //2.指定编码 gbk
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //3.把InputStreamReader 传入 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //将2和3合起来
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"gbk"));

        //4. 读取
        String s = bufferedReader.readLine();
        System.out.println("读取内容：" + s);
        bufferedReader.close();
    }
}
```



![image-20250528162211702](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250528162211702.png)

```java
/**
 * @author 司志俊
 * @version 1.0
 * 演示OutputStreamWriter的使用 
 *把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理gbk/utf8/utf-8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\szj.txt";
        String charSet = "gbk";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        outputStreamWriter.write("司志俊是大帅逼");
        outputStreamWriter.close();
        System.out.println("按照" + charSet + "保存文件成功~");
    }
}
```

