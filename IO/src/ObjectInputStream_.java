import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath="d:\\data.dat";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readUTF());
        Object o=ois.readObject();
        Dog dog=(Dog) o;
        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(o);
        ois.close();
    }
}
