package printstream_;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * @author 司志俊
 * @version 1.0
 */
public class PrintWriter_ {
    public static void main(String[] args) throws Exception{
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\f.txt"));
        printWriter.println("孤独患者");
        printWriter.close();
    }
}
