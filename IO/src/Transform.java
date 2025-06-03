import java.io.*;
import java.nio.Buffer;

public class Transform {
    public static void main(String[] args) throws Exception{
//        String filePath="d:\\test01.txt";
//       BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"UTF-8"));
//        String line=br.readLine();
//        System.out.println(line);
//        br.close();
        String filePath="d:\\hsp.txt";
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"UTF-8"));
        bw.write("gogogo出发咯！");
        bw.close();

    }
}
