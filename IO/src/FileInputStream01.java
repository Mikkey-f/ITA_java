import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile(){
        String filePath="d:\\news3.txt";
        FileInputStream fileInputStream=null;
        byte[] buf=new byte[8];
        try {
            fileInputStream=new FileInputStream(filePath);
            int readLen=0;
            while((readLen=fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

