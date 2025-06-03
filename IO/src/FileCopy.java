import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

    }
    @Test
    public void copy(){
        String scrFilePath="d:\\news2.txt";
        String desFilePath="d:\\news5.txt";
        byte[] buf=new byte[1024];
        int len=0;
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            fileInputStream=new FileInputStream(scrFilePath);
            fileOutputStream=new FileOutputStream(desFilePath);
            while((len=fileInputStream.read(buf))!=-1){
                fileOutputStream.write(buf,0,len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            try {
                if(fileOutputStream!=null)
                    fileOutputStream.close();
                if(fileInputStream!=null)
                    fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
