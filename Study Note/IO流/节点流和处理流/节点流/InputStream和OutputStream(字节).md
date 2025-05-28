# InputStream和OutputStream（字节）



## 一.体系图

![image-20250526193943500](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526193943500.png)

![image-20250526194605036](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526194605036.png)





## 二.子类

### 1.FileInputStream

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526194910770.png" alt="image-20250526194910770" style="zoom:80%;" />

**实例：**

1.读取单个字节

```java
/**
     * 演示读取文件
     * 单个字节的读取，效率低
     */
    @Test
    public void readFile01() {
        int read = 0;
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            //从输入流读取一个字节的数据，如果没有输入可用，该方法将阻止
            //返回-1表示读取完毕
            while ((read = fileInputStream.read()) != -1) {//一定要这样写
                System.out.print((char) read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
```



2.使用read(byte[] b)

```java
     /**
     * 使用read(byte[] b)
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        byte[] b = new byte[8];//一次读八个字节
        int readlen = 0;//代表读入的个数

        try {
            fileInputStream = new FileInputStream(filePath);
            //从输入流读取一个字节的数据，如果没有输入可用，该方法将阻止
            //返回-1表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while ((readlen = fileInputStream.read(b)) != -1) {//一定要这样写
                System.out.print(new String(b, 0, readlen));//从第0个位置开始读取readlen个
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
```



### 2.FileOutputStream

![image-20250526203814175](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526203814175.png)

![image-20250526203854179](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526203854179.png)



```java
     /**
     * 演示使用FileOutputStream 将数据写到文件中
     * 如果文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {

            //new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            //new FileOutputStream(filePath, true) 创建方式 当写入内容时，是追加到文件后面
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
            //fileOutputStream.write('H');

            //写入字符串
            String str = "hello,world";
            fileOutputStream.write(str.getBytes());//str.getBytes()将字符数组转成byte[]字节数组
            //等价于 fileOutputStream.write(str.getBytes(),0,str.length());从0位置开始写str.length()个进去


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
```





## 三.文件拷贝

![image-20250526212225687](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526212225687.png)

![image-20250526213449562](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250526213449562.png)

```java
public class FileCopy {
    public static void main(String[] args) {
        String filePath = "d:\\xianr.jpg";
        String destFilePath = "d:\\xianren.jpg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            //定义一个字节数组提供效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //边读边写
                fileOutputStream.write(buf, 0, readLen);//一定要使用这个方法
            }
            System.out.println("拷贝成功");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

```

