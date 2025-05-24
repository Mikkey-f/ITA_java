# io流

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CC337F9F18D3E28CF7D8C0C94BD3FC012.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CDFFEBD1F3579E153C7C1779414B44AF5.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C69D02ABF82000ABEFE537F25064A2F40.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CCC227756443EC298BD10F93F709C6116.jpg)



## FileOutputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CD66DAFBB627E4E719932B6F45324BEC9.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CC792340D3C7CB2FF918D55F03737757B.jpg)

`

```
//1.     字节输出流 FileOutputStream
        //写出一段文字到本地文件中。
        /**
         * 实现步骤:
         *      1.创建对象
         *         细节1:参数是字符串表示的路径或者是File对象表示的路径都可以
         *         细节2:如果文件不存在会创建一个新的文件，但要保证父级路径存在
         *         细节3:如果文件已经存在,则会清空文件。(若文件中已有abc,write后变为a)
         *      2.写出数据
         *         细节:write方法的参数是整数,但实际写入文件中的是数字在ASCII上对应的字符
         *      3.释放资源
         *        每次使用完流后都要释放资源
         *
         */
        //1.写出输出流 OutputStream   本地文件  File
        FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //FileOutputStream fe1=new FileOutputStream(new File("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt"));
        fe.write(97);//文件中出现a
        fe.close();//释放资源。
//2.    FileOutputStream写数据的三种方式。
        //1.void write(int b) 一次写一个字节数据
        //2.void write(byte[] b) 一次写一个字节数组数据、
        //3.void write(byte[]b,int off,int len) 一次写一个字节数组的部分数据
        
         //FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //1.
        //fe.write(97);//a

        //2.
        //byte[]ss={97,98,99,100,101};
        //fe.write(ss);//abcde

        //3.off:起始索引 len:个数
        //fe.write(ss,1,3);//bcd

//3. 换行写:windows:\r\n
     linux:\n
     mac:\r
     细节:java在windows中可以只写\r或\n的其中一个。
     
     续写:
     打开续写开关即可。
     开关位置:创建对象的第二个参数
     默认false：表示关闭续写,此时创建对象会清空文件
     手动传递true,表示打开续写
     
     FileOutputStream fe=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt",true);

        String n="\r\n";
        byte[] bytes1 = n.getBytes();
        String s="orzorzorz";
        byte[] bytes = s.getBytes();
        String ss="114514";
        byte[] bytes2 = ss.getBytes();
        fe.write(bytes);
        fe.write(bytes1);
        fe.write(bytes2);

        fe.close();

```

## FileInputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CDEB2BFD7A447AEA9761AD678D6770AE0.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C7D8E84A9DD5D42E0406F7355A3AB5601.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C8A67F1B3CFE546D57CD14329621FD1EA.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C45F2EE7B6569CDFCB53FB8F0298A3CDF.jpg)

```java
//1.创建字节输入流对象 细节:如果文件不存在,直接报错
        FileInputStream fe=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        //2.读取数据 细节1:一次只读一个字节   细节2:读到文件末尾,read方法返回-1.
        int b = fe.read();//111:o 只读一个

        System.out.println((char) b);//o 转换


        fe.close();
        //循环读取
        FileInputStream fs=new FileInputStream("C:\\code\\ideaprogram\\ITA_java\\a.txt.txt");
        int bk;
        while ((bk=fs.read())!=-1){//用bk接收，否则指针会移动两次。
            System.out.print((char)bk);
        }
        fs.close();

//2. FileInputStream一次读多个字节
//一次读取多个字节数据,具体读多少,跟数组的长度有关,读取后存在数组中(*)
        //返回值:本次读取到了多少个字节数据
        /*int len1=fe.read(bytes);
        System.out.println(len1);//2

        String str=new String(bytes);
        System.out.println(str);//ab

        int len2=fe.read(bytes);
        System.out.println(len2);//2

        String str1=new String(bytes);
        System.out.println(str1);//cd

        int len3=fe.read(bytes);
        System.out.println(len3);//1

        String str2=new String(bytes);
        System.out.println(str2);//ed-->会将str1中的cd中的c覆盖为e,会出现问题     */

        //改进措施(********)
        int len;
        len=fe.read(bytes);
        System.out.println(new String(bytes,0,len));//ab
        len=fe.read(bytes);
        System.out.println(new String(bytes,0,len));//cd
        len=fe.read(bytes);
        System.out.println(new String(bytes,0,len));//e

        fe.close();


//3.练习:拷贝大的文件
FileInputStream fe=new FileInputStream("C:\\baidunetdiskdownload\\VMware-workstation-full-17.5.0-22583795.exe");
        FileOutputStream fis=new FileOutputStream("C:\\code\\ideaprogram\\ITA_java\\b.txt.txt");
        byte[]bytes=new byte[1024*1024*5];
        int len;
        while ((len=fe.read(bytes))!=-1){
            fis.write(bytes,0,len);//防止发生覆盖现象-->len写入的字符个数.
        }
        fis.close();
        fe.close();

```

## 输入中文会有乱码的原因

1.读取数据时未读完整个汉字(字节流一次只能读取一个字节，而中文不只一个字节) UTF-8:占三个字节 GBK:占两个字节

2.编码和解码方式不同                                                (UTF-8并不是字符集，Unicode才是字符集)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C44C5CD210875A1B224CB99FAC2CDACC0.jpg)

解决方法：

1.不要用字节流读取文本文件

2.编码和解码时使用同一个码表，同一个编码方式

拓展：1.为什么字节流读取中文会乱码，而拷贝时却不会：

因为拷贝是一个字节一个拷贝的，记事本写入和读取用的都是同一个编码方式。

## FileReader和FileWriter介绍（字符输入，输出流）

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C00F23119FE6CF320C4CB8C1CE1A3FF4B.jpg)

```
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象。
        FileReader reader = new FileReader("C:\\code\\ideaprogram\\ITA_java\\story.txt.txt");
        int bk;
        while ((bk=reader.read())!=-1){//1. 一个一个字符读取（速度慢)
            System.out.print((char) bk);
        }
        reader.close();

    }
    public void readFile01() throws IOException {
        //2.多个字符读取
        char[] c = new char[5];
        int ck;//读取到的字符数。返回-1，读完了
        FileReader reader = new FileReader("C:\\code\\ideaprogram\\ITA_java\\story.txt.txt");
        while ((ck=reader.read(c))!=-1){
            System.out.print(new String(c,0,ck));
        }

    }
}
```

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C31BF98A2E33C121B8B9E93A1C9E1CD5E.jpg)

注意:FileWriter使用后,必须要close或flush(刷新)，否则数据一直在内存中. 根据业务考虑是选用覆盖模式还是追加模式。

```
/创建FileWriter对象
        /**   写入方式：
         *   2.write(char[]):写入指定数组
         *   3.write(char,off,len):写入指定数组的指定部分
         *   4.write(String):写入整个字符串
         *   5.write(String,off,len):写入字符串的指定部分
         */
        FileWriter writer = new FileWriter("C:\\code\\ideaprogram\\ITA_java\\test.txt.txt",true);
        //1.
        //writer.write('H');
        //2.
        char[]chars={'a','b','c'};
        //writer.write(chars);
        //3.
        //writer.write("yoshiki".toCharArray(),0,6);
        //4.
        writer.write("啊啊啊");
        writer.write("呃呃呃");
        writer.write("114514");
        //5.
        writer.write("呃呃呃",0,2);
        writer.flush();
        writer.close();//等价->flush()+关闭。
        //在数据量大的情况下，进行循环操作
        //flush底层：
        /*private void writeBytes() throws IOException {
        bb.flip();
        int lim = bb.limit();
        int pos = bb.position();
        assert (pos <= lim);
        int rem = (pos <= lim ? lim - pos : 0);

        if (rem > 0) {
            out.write(bb.array(), bb.arrayOffset() + pos, rem);
        }
        bb.clear();
    }*/
    }
```

## 节点流和处理流

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CAAF8455559C65B45A9B87916324AEE24.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C20DEBC8C7239C0AF7166272579FEA2AD.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CF6BE525583B4F37092E70E9F4737B4A9.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C9EB444AC1A8016B6271B872C56619BDE.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CFB8A6994F4DAA2DDEE5F4BFE765846CE.jpg)

### 模拟使用

```
public abstract class Reader_ {//抽象类
    public  void readFile(){

    }
    public void readString(){

    }
    //也可以用read()方法统一管理
    //后面在调用时，利用对象动态绑定机制,绑定到对应的实现子类即可
}
//节点流--->和具体的数据源相关
class FileReader_ extends Reader_{
    public void readFile(){
        System.out.println("对文件读取");
    }
}
class StringReader_ extends Reader_{
    public void readString(){
        System.out.println("读取了字符串");
    }
}
//做成处理流（包装流）
class BufferedReader_ extends Reader_{
    private Reader_ reader_;
    //接收Reader_的子类对象
    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    public void readFile(){
        this.reader_.readFile();
    }
    //让方法更灵活,多次读取文件
    public void readFiles(int num){
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }
    //扩展 readString,批量处理字符串数据
    public void readString(int num){
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
```

```
public class TestReader_ {
    public static void main(String[] args) {
        //对文件多次读取
        BufferedReader_ bufferedReader = new BufferedReader_(new FileReader_());
        bufferedReader.readFiles(5);
        //对字符串多次读取
        BufferedReader_ bufferedReader1=new BufferedReader_(new StringReader_());
        bufferedReader1.readString(3);
    }
}
```

### 节点流和处理流的区别与联系

1.节点流是底层流/低级流，直接跟数据源相接

2.处理流(包装流)包装节点流，既可以清除不同节点流之间的差异，也可以提供更方便的方法来完成输入输出。

3.处理流对节点流进行包装，使用了修饰器设计模式，不会直接与数据源相连



处理流的主要功能:

1.性能的提高:主要以缓冲的方式提高输入输出的效率

2.操作更灵活，可一次输入输出大批量数据

处理流-BufferedReader和BufferedWriter属于字符流，按照字符来读取数据的，

关闭时处理流，只需关闭外层流即可

注意:1.BufferedReader和BufferedWriter是按照字符来操作的,所以不要操作二进制文件[声音,视频等....]，否则可能会造成文件损坏

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CD9B20AA6C50CA7326504F71124810558.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C6D88F35EA746801BC758ABAA39F539E8.jpg)

## BufferedInputStream-BufferedOutputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CF4DAB092AC0AE5176B89CA09B0EDCB2A.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C7E9873A38577990D21AFCDF5881242BE.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CD05FFF2EE630B2DC380214C3CF546471.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CE0A23772C37CE9D7E4C7876F932FBA5E.jpg)

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CAFA284CEA3C01667D46C28AF8A26EED2.jpg)

## 

### 对象流-ObjectInputStream和ObjectOutputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C34628C3397E07A2C42046978FEB0F4BC.jpg)

#### 序列化与反序列化

1.序列化就是在保存数据时，保存数据的值和数据类型

2。反序列化就是在恢复数据时，恢复数据的值和数据类型

3.需要让某个对象支持序列化机制，则必须让其类可序列化，该类必须实现以下两个接口之一:

Serializable //这是一个标记接口，没有方法

Externalizable//有方法需要实现，一般用Serializable

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C075FB59EC525B87154EDF80C8B4673D6.jpg)

#### ObjectInputStream(反序列化）和ObjectOutputStream（序列化）

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C46B0E4A1F6753BDFD395FB83CC0D55BF.jpg)

##### ObjectOutputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5C96114FE97369691BCA65FDE78D386CCB.jpg)

##### ObjectInputStream

![](C:%5CUsers%5C23139%5COneDrive%5CPictures%5CFB87A5C07859765B81292C20E34579EF.jpg)