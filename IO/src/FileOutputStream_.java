import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_{
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath="d:\\news2.txt";
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(filePath,true);//多了这个true就是添加，没加就是覆盖
            //写入一个字节
            fileOutputStream.write('a');
            //写入一个字符串
            String str="hhhhh,666fff";
            fileOutputStream.write(str.getBytes());
            String str2=" qkqkqk";
            fileOutputStream.write(str2.getBytes(),0,7);//左闭右开
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
