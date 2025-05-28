package file_;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 司志俊
 * @version 1.0
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1
    @Test
    public void create01(){
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //d:\\news2.txt
    public void creat02(){
        File parentfile = new File("d:\\");
        String fileName = "news2.txt";
        //这里的file在java程序中只是一个对象
        //只有执行了createNewFile 方法，才会真正的在磁盘创建该文件
        File file = new File(parentfile,fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功~");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    public void create03(){
        String parentPath = "d:\\";
        String filename = "news3.txt";
        File file = new File(parentPath,filename);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
