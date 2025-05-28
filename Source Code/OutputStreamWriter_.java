package transformation;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author 司志俊
 * @version 1.0
 * 演示OutputStreamWriter的使用
 *把FileOutputStream 字节流，转成字符流 OutputStreamWriter
 * 指定处理gbk/utf8/utf-8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "d:\\szj.txt";
        String charSet = "gbk";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), charSet);
        outputStreamWriter.write("司志俊是大帅逼");
        outputStreamWriter.close();
        System.out.println("按照" + charSet + "保存文件成功~");
    }
}
