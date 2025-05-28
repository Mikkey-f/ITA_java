package writer_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 司志俊
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "d:\\news2.txt";
        FileWriter fileWriter = null;
        char[] c = {'f','y','a','o'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('s');
            fileWriter.write(c);
            fileWriter.write(c,2,2);//表示从索引 2 开始写入 2 个字符。
            fileWriter.write("司志俊帅帅");
            fileWriter.write("司志俊帅帅".toCharArray(),0,3);//写入指定数组的指定部分
            fileWriter.write("我喜欢吃烧烤",0,3);//写入字符串的指定部分

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
