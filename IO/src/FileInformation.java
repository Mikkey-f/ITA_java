import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file=new File("d:\\news3.txt");
        System.out.println("文件名字"+file.getName());
        System.out.println("文件绝对路径="+ file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParentFile());
        System.out.println("文件是否存在"+file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}

