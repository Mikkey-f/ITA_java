import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter_ {
    public static void main(String[] args) {
        String filePath="d:\\test01.txt";
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(filePath,true));
            bufferedWriter.write("我是一个大学生");
            bufferedWriter.newLine();
            bufferedWriter.write("我是一个小学生");
            bufferedWriter.newLine();
            bufferedWriter.write("加油Chain！",0,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
