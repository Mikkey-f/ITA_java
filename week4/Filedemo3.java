import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Filedemo3 {
    public static void main(String[]args) {
        //public File[] listFiles  获取当前该路径下的所有内容******最重要

        //1.创建File对象
        File file1 = new File("C:\\code\\ideaprogram\\ITA_java");
        //listFiles方法
        //作用:获取ITA_java文件夹里面的所有内容，把所有内容放到数组中返回
        File[] files = file1.listFiles();
        for(File f:files){//f依次表示ITA_java文件夹里面的每一个文件或者文件夹.
            System.out.println(f);
        }

        //2.public static File[] listRoots() 列出可用的文件系统根。--->获取系统中的所有盘符
        File[]arr=File.listRoots();
        System.out.println(Arrays.toString(arr));

        //3.public String[]list 获取当前路径下的所有内容
        File file2=new File("C:\\code\\ideaprogram\\ITA_java");
        String[] arr2 = file2.list();
        for(String s:arr2){
            System.out.println(s);
        }

        //4.public String[]list(FilenameFilter filter)
        //需求:只获取路径下带.iml的文件。
        File file3=new File("C:\\code\\ideaprogram\\ITA_java");
       String[]arr3= file3.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {//参数1:父级路径 参数2:子级路径
                File judge=new File(dir,name);
                return judge.isFile()&&judge.getName().endsWith("iml");
            }
        });
        System.out.println(Arrays.toString(arr3));//ITA_java.iml

        //5.public File[] listFiles(FileFilter filter) 利用文件名过滤器获取
        File st=new File("C:\\code\\ideaprogram\\ITA_java");
        File[] imls = st.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith("iml");
            }
        });
        System.out.println(Arrays.toString(imls));//[C:\code\ideaprogram\ITA_java\ITA_java.iml]

        //6.public File[] listFiles(FilenameFilter filter)

    }
}
