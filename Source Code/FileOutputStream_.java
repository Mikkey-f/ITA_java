package outputstream_;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 司志俊
 * @version 1.0
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }

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
}
