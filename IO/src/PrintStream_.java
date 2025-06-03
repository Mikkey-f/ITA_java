import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) {
        PrintStream out=System.out;
        out.println("John,Hello!");
        try {
            out.write("韩顺平你好！\n".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            System.setOut(new PrintStream("d:\\test02.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("看到了");
        try {
            out=new PrintStream("d:\\test03.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        out.println("输出到文件");
        out.close();
    }
}
