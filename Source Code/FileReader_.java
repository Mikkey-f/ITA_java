package reader_;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 司志俊
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "d:\\news1.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            //读取 read
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void read01(){
        String filePath = "d:\\news1.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            //读取 read
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new String(buf,0,readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
