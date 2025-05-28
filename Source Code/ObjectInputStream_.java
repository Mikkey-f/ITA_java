package intputstream_;

import outputstream_.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author 司志俊
 * @version 1.0
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        //指定反序列化文件
        String filePath = "d:\\data.txt";

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));

        //读取
        //读取(反序列化)的顺序需要和你保存数据的(序列化) 的顺序一致
        //否则出现异常
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());

        //dog 的编译类型 Object 运行类型 Dog
        Object dog = objectInputStream.readObject();
        System.out.println("运行类型 " + dog.getClass());
        System.out.println("dog信息=" + dog);//底层 Object -> Dog

        objectInputStream.close();//自动关闭

        //希望调用dog的方法，要向下转型
        //把Dog类的定义拷贝到可以引用的地方
        Dog dog1 = (Dog) dog;
        System.out.println(dog1.getName());
    }
}
