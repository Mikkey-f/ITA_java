import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory {
    public static void main(String[] args) {

    }
    @Test
    public void m2(){
        File file=new File("d:\\news1.txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println(file.getName()+"删除成功");
            }else{
                System.out.println("删除文件失败");
            }
        }else{
            System.out.println("该文件不存在");
        }
    }
    @Test
    public void m3(){
        File file=new File("d:\\demo01");
        file.mkdir();
    }

}

