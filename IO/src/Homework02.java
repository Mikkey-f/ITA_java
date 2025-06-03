import java.io.*;

public class Homework02 {
    public static void main(String[] args) {
        String filePath="d:\\test01.txt";
        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"GBK"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        String line="";
        int t=0;
        try {
            while((line=br.readLine())!=null){
                System.out.println((++t)+line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
