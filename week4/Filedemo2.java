import java.io.File;

public class Filedemo2 {
    public static void main(String[]args){
        //1.public boolean isDirectory() 判断此路径名表示的File是否为空文件夹
        File f1=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//2.public boolean isFile 判断此路径名表示的File是否为文件 true
        System.out.println(f1.exists());//3.public boolean exists 判断此路径名表示的File是否存在  true
        File f2=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.jpg");
        System.out.println(f2.isFile());//false

        //4.public long length() 返回文件的大小(字节数量)
        //细节1:这个方法只能获取文件的大小,如果单位是M,G,可以不断除以1024
        //细节2:这个方法无法获取文件夹大小 要获取文件夹大小需把里面的所有文件全部加起来。
        File file3=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml");
        long len=file3.length();
        System.out.println(len);//459

        File file4=new File("C:\\code\\ideaprogram\\ITA_java");
        long len2 = file4.length();
        System.out.println(len2);//0 wu==无法获取
        //5.public String getAbsolutePath() 返回文件的绝对路径
        File file5=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml");
        String Path=file5.getAbsolutePath();
        System.out.println(Path);
        File f7=new File("untitled\\a.txt");
        String Path1= f7.getAbsolutePath();
        System.out.println(Path1);//C:\\code\\ideaprogram\\untitled\\untitled\\a.txt
        //6.public String getPath() 返回定义文件时使用的路径。
        File f6=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml");
        String path2=f6.getPath();
        System.out.println(path2);
        String path3=f7.getPath();
        System.out.println(path3);//untitled\a.txt
        //7.public String getName() 返回文件的名称，带后缀
        //细节1:ITA_java.iml  ITA_java:文件名  iml:后缀名
        //细节2:文件夹 返回的就是文件夹的名字
        File f8=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml");
        String name=f8.getName();
        System.out.println(name);//ITA_java.iml

        File f9=new File("C:\\code\\ideaprogram\\ITA_java\\ITA_java");
        String name1=f9.getName();
        System.out.println(name1);//ITA_java
        //8.public long lastModified()返回文件的最后修改时间(ms)

    }
}
