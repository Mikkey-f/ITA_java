import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("src\\mysql.properties"));
        String line="";
        while((line=br.readLine())!=null){
            String[] split=line.split("=");
            System.out.println(split[0]+"的值是"+split[1]);
        }
    }
}
