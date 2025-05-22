package io.FileReaderAndFileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象
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
}
