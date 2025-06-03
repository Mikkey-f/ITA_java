import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {

    }
    @Test
    public void create01(){
        String filePath="d:\\news1.txt";
        File file=new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println("创建失败");
            throw new RuntimeException(e);
        }
    }
    @Test
    public void create02(){
        File parentFile =new File("d:\\");
        String fileName="news2.txt";
        File file=new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println("创建失败");
            throw new RuntimeException(e);
        }
    }
    @Test
    public void create03(){
        File file=new File("d:\\");
        File newFile3=new File(file,"news3.txt");
        try {
            newFile3.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            System.out.println("创建失败");
            throw new RuntimeException(e);
        }
    }
}

