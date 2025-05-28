# BufferedReader和BufferedWriter



![image-20250527161515369](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527161515369.png)



## 一.BufferedReader

![](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527161843316.png)

```java
public class BufferedReader_ {
    public static void main(String[] args) throws Exception {

        String filePath = "d:\\Hello.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String ling;//按行读取
        //bufferedReader.readLine() 按行读取,返回空表示读取结束
        while ((ling = bufferedReader.readLine()) != null) {
            System.out.println(ling);
        }

        //只需要关闭bufferedReader，底层会自动关闭节点流
        bufferedReader.close();
    }
}
```





## 二.BufferedWriter

![image-20250527163718070](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527163718070.png)

```java
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\ok.txt";
        //new FileWriter(filePath,true) 追加
        //new FileWriter(filePath) 覆盖
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello,帅帅的司志俊");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello,帅帅的司志俊2");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello,帅帅的司志俊3");

        //关闭bufferedWriter即可，new FileWriter(filePath)在底层被关闭
        bufferedWriter.close();
    }
}
```





## 三.案例

![image-20250527164746669](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527164746669.png)

```java
public class BufferedCopy_ {
    public static void main(String[] args) throws Exception{
        
        //1.BufferedWriter和BufferedReader 是按照字符读取的
        //不要去操作 二进制文件[声音 视频 pdf] 可能造成文件损坏
        String srcFilePath = "d:\\Hello.java";
        String destFilePath = "d:\\hello1.java";
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        String line;

        bufferedReader = new BufferedReader(new FileReader(srcFilePath));
        bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            //换行符
            bufferedWriter.newLine();
        }

        if (bufferedWriter != null){
            bufferedWriter.close();
        }
        if (bufferedReader != null){
            bufferedReader.close();
        }
    }
}
```

