package file_;

import org.junit.Test;

import java.io.File;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

        //
    }

    //判断d:\\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath = "d:\\news2.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该文件不存在。。。");
        }
    }

    //判断d:\\demo02 是否存在，如果存在就删除
    //在java编程中，目录也被当作文件
    @Test
    public void m2(){
        String filePath = "d:\\demo02";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("该目录不存在。。。");
        }
    }

    //判断 d:\\demo\\a\\b\\c 目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3(){
        String directoryPath = "d:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()){
            System.out.println("该目录已经存在");
        }else {
            if (file.mkdirs()){
                System.out.println("该目录创建成功");
            }else {
                System.out.println("该目录创建失败");
            }
        }
    }
}
