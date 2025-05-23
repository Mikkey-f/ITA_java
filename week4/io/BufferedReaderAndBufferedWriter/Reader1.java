package io.BufferedReaderAndBufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//尽量不要是二进制文件（因为它是按字符组织的）
//只需关闭外层流即可
public class Reader1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("C:\\code\\ideaprogram\\ITA_java\\story.txt.txt"));
        String str;//按行读取,效率高
        while ((str=bf1.readLine())!=null){//当返回null时,表示文件读取完毕。
            System.out.println(str);
        }
        bf1.close();//关闭流，只需关闭bf1即可,底层会自动关闭FileReader节点流.
        /*  底层
        public void close() throws IOException {
        synchronized (lock) {
            if (in == null)
                return;
            try {
                in.close();//in--->传入的new FileReader().
            } finally {
                in = null;
                cb = null;
            }
        }
    }
         */
    }
}
