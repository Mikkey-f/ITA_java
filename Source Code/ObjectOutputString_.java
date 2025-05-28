package outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 司志俊
 * @version 1.0
 * 演示ObjectOutputString的使用，完成数据的序列化
 */
public class ObjectOutputString_ {
    public static void main(String[] args) throws Exception {
        //序列化后保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "d:\\data.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到d:\data.szj
        objectOutputStream.writeInt(100);//int -> Integer (实现了Serializable)
        objectOutputStream.writeBoolean(true);//bool -> Bool
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(1.111);
        objectOutputStream.writeUTF("司志俊");
        objectOutputStream.writeObject(new Dog("大黄", 10, "yellow", "中国"));

        objectOutputStream.close();
        System.out.println("完毕");
    }
}
