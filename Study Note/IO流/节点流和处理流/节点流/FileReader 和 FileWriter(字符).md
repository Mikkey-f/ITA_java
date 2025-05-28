# FileReader 和 FileWriter（字符）

## 一.FileReader

![image-20250527135541343](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527135541343.png)

![image-20250527135640735](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527135640735.png)

**实例：**

使用FileReader 从news1.txt中读取内容，并显示

1.字符数组读取

```java
public void read01(){
        String filePath = "d:\\news1.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            //读取 read
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
```

2.单个字符读取

```java
String filePath = "d:\\news1.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            //读取 read
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
```







## 二.FileWriter

![image-20250527135939030](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527135939030.png)

![image-20250527140031748](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527140031748.png)



**实例：**

![image-20250527143528988](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527143528988.png)

```java
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "d:\\news2.txt";
        FileWriter fileWriter = null;
        char[] c = {'f','y','a','o'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('s');
            fileWriter.write(c);
            fileWriter.write(c,2,2);//表示从索引 2 开始写入 2 个字符。
            fileWriter.write("司志俊帅帅");
            fileWriter.write("司志俊帅帅".toCharArray(),0,3);//写入指定数组的指定部分
            fileWriter.write("我喜欢吃烧烤",0,3);//写入字符串的指定部分

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
```

