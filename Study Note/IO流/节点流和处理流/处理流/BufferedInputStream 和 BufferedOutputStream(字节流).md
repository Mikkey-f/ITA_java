# BufferedInputStream 和 BufferedOutputStream



![image-20250527172017474](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527172017474.png)

![image-20250527172643196](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527172643196.png)

![image-20250527172712198](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250527172712198.png)

```java
/**
 * @author 司志俊
 * @version 1.0
 * 字节流可以操作二进制文件，可以操作文本文件
 */

public class BufferedCopy02 {
    public static void main(String[] args) throws Exception{
        String srcFilePath = "d:\\fy.jpg";
        String destFilePath = "d:\\hsp.jpg";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        //FileInputStream 是InputStream 的子类
        bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

        byte[] buff = new byte[1024];
        int readLen = 0;

        while ((readLen = bufferedInputStream.read(buff)) != -1){
            bufferedOutputStream.write(buff,0,readLen);
        }

        if (bufferedInputStream != null)bufferedInputStream.close();
        if (bufferedOutputStream != null)bufferedOutputStream.close();
    }
}
```

