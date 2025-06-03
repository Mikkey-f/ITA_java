import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath="d:\\data.dat";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);
        oos.writeBoolean(false);
        oos.writeUTF("哈哈哈");
        oos.writeObject(new Dog("大黄",2));
        oos.close();
        System.out.println("保存完毕");
    }
}

