import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;
        String scrPath="d:\\test01.txt";
        String desPath="d:\\test02.cpp";
        String line=" ";
        try {
            br=new BufferedReader(new FileReader(scrPath));
            bw=new BufferedWriter(new FileWriter(desPath));
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            try {
                if(br!=null)
                    br.close();
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
