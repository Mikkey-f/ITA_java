import java.io.*;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directory="d:\\mytemp";
        File file=new File(directory);
        if(!file.exists()){//不存在就要创建
            if(file.mkdirs()){//创建成功
                System.out.println("目录"+file.getName()+"创建成功！");
            }else{
                System.out.println("目录"+file.getName()+"创建失败！");
            }
        }
        String filePath=directory+"\\hello.txt";
        file=new File(filePath);
        if(!file.exists()){//不存在就要创建
            if(file.createNewFile()){//创建成功
                System.out.println(filePath+"创建成功！");
                BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
                bw.write("啦啦啦啦");
                bw.close();
            }else{
                System.out.println(filePath+"创建失败！");
            }
        }else{
            System.out.println(filePath+"已经存在，不再重复创建");
        }
    }
}
