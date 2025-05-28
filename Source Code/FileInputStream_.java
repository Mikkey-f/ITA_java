package intputstream_;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 司志俊
 * @version 1.0
 * 演示FileInputStream的使用
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件
     * 单个字节的读取，效率低
     * 使用read(byte[] b)
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

    /**
     * 使用read(byte[] b)
     */
    @Test
    public void readFile02() {
        String filePath = "d:\\hello.txt";
        FileInputStream fileInputStream = null;
        byte[] b = new byte[8];//一次读八个字节
        int readlen = 0;

        try {
            fileInputStream = new FileInputStream(filePath);
            //从输入流读取一个字节的数据，如果没有输入可用，该方法将阻止
            //返回-1表示读取完毕
            //如果读取正常，返回实际读取的字节数
            while ((readlen = fileInputStream.read(b)) != -1) {//一定要这样写
                System.out.print(new String(b, 0, readlen));
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
