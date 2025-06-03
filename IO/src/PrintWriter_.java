import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws Exception{
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("你好 北京！");
        pw.close();
        PrintWriter pw1=new PrintWriter(new FileWriter("d:\\test04.java"),false);

        pw1.println("哈哈ohh");
        pw1.close();
    }
}
