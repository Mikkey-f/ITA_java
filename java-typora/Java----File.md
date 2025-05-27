# Java----File

## 1.常见的成员方法（获取并遍历）

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C91407CF66B690A1244F509508FED3917.jpg)

1.创建文件夹:

```
String pathname="C:\\code\\ideaprogram\\ITA_java\\mytemp";
File f = new File(pathname);
f.mkdirs()
```

2.创建文件:

```
String pathname1=pathname+"\\hello.txt";//pathname+"\\hello.txt"
File f1=new File(pathname1);
f1.createNewFile();
```



```
//相对路径:不带盘符，默认到当前项目下找  绝对路径:带盘符
//1.public File(String pathname) 根据文件路径创建文件对象
//2.public File(String parent,String child) 根据父路径名字符串和子路径名字符串创建文件对象
//3.public File(File parent,String child) 根据父路径对应文件对象和子路径名字符串创建文件对象

//1.
        String str="C:\\code\\ideaprogram\\ITA_java\\ITA_java.iml";
        File file=new File(str);
        System.out.println(file);      C:\code\ideaprogram\ITA_java\ITA_java.iml
        //2.
        String parent="C:\\code\\ideaprogram\\ITA_java";
        String son="ITA_java.iml";
        File file1=new File(parent,son);
        System.out.println(file1);          C:\code\ideaprogram\ITA_java\ITA_java.iml
        //3.
        File file2=new File("C:\\code\\ideaprogram\\ITA_java");
        String child="ITA_java.iml";
        File file3=new File(file2,child);
        System.out.println(file3);                C:\code\ideaprogram\ITA_java\ITA_java.iml
```



```
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
```



```
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
```