package io.printStreamAndprintWriter;

import java.io.IOException;
import java.io.PrintStream;

//演示PrintStream (字节打印流/输出流)
public class printStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out=System.out;

        //默认输出数据的位置是标准输出,即显示器
        out.print("john,hello");

        //因为print底层使用的是write,所以我们可以直接调用write 打印/输出
        out.write("说的道理".getBytes());
        out.close();

        //我们可以修改打印流输出的位置/设备
        //1.输出修改成到:"C:\code\ideaprogram\ITA_java\story.txt"
        //2.就会输出到 C:\code\ideaprogram\ITA_java\story.txt.
        System.setOut(new PrintStream("C:\\code\\ideaprogram\\ITA_java\\story1.txt"));
        System.out.println("helloabcde");
    }
}
