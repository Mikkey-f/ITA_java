import java.io.File;

public class Filedemo1 {
    public static void main(String[]args){
        //相对路径:不带盘符，默认到当前项目下找  绝对路径:带盘符
        //1.public File(String pathname) 根据文件路径创建文件对象
        //2.public File(String parent,String child) 根据父路径名字符串和子路径名字符串创建文件对象
        //3.public File(File parent,String child) 根据父路径对应文件对象和子路径名字符串创建文件对象

        //1.
        String str="C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml";
        File file=new File(str);
        System.out.println(file);
        //2.
        String parent="C:\\code\\ideaprogram\\ITA_java";
        String son="ITA_java.iml";
        File file1=new File(parent,son);
        System.out.println(file1);
        //3.
        File file2=new File("C:\\code\\ideaprogram\\ITA_java");
        String child="ITA_java.iml";
        File file3=new File(file2,child);
        System.out.println(file3);
    }
}
