import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader_ {
    public static void main(String[] args) {
        String filePath="d:\\news5.txt";
        FileReader fileReader=null;
        int data=0;
        try {
            fileReader=new FileReader(filePath);
            while((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
