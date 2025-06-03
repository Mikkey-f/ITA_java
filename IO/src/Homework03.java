import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        try {
            properties.load(new FileReader("src\\dog.properties"));
            properties.list(System.out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String name=properties.getProperty("name");
        int age=Integer.parseInt(properties.getProperty("age")+"");
        Cat cat=new Cat(name,age);
        //序列化
        String filePath="d:\\dog.dat";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(cat);
        oos.close();
        filePath="d:\\dog.dat";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        Cat cat1=(Cat)ois.readObject();
        System.out.println(cat1);
        ois.close();
    }
}
class Cat implements Serializable {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
