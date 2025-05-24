package io.ObjectInputStream_ObjectOutputStream;

import java.io.*;

//完成数据的序列化
public class ObjectOutputStreamdemo1 {
    public static void main(String[] args) throws IOException {
        //序列化后，保存的文件格式,不是存文本，而是按照它的格式保存
        String filepath="C:\\code\\ideaprogram\\ITA_java\\story.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        //序列化数据到文件中
        oos.write(100);//int->Integer 实现了Serializable接口
        oos.writeBoolean(true);//boolen->Boolean 实现了Serializable接口
        oos.writeChar('a');//char->Character 实现了Serializable接口
        oos.writeDouble(9.5);//double->Double 实现了Serializable接口
        oos.writeUTF("张三");//String可以序列化

        //保存一个dog对象
        oos.writeObject(new Dog("王五",10));
        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}
//如果需要序列化某个类的对象，必须实现接口
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}