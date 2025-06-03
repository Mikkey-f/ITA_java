import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream02 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile(){
        String filePath="d:\\news3.txt";
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(filePath);
            int readCode=0;
            while((readCode=fileInputStream.read())!=-1){
                System.out.print((char)readCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
