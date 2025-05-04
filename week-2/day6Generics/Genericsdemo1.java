package day6Generics;

import java.util.ArrayList;
import java.util.Arrays;

/*   泛型   */
public class Genericsdemo1 {
    public static void main(String[]args) {
        //1.格式：<数据类型> --->只支持引用数据类型。
        //若没有泛型，可在集合中添加任意数据类型，默认所有类型为Object
        //细节:指定泛型类型后，传入数据时，可以传入该类类型或子类类型。

        /*1.   泛型类    */
        MyArrayList<String>list=new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        System.out.println(list.toString());

        /*2.   泛型方法    */
        //方法中形参类型不确定时:1.使用类名后面定义的泛型(所有方法可用）2.在方法声明上定义自己的泛型(只有本方法可用)
        //格式:public <T> void show(T t)
        ArrayList<Integer>list1=new ArrayList<>();
        ListUtil.addAll(list1,1,2,3,4);
        System.out.println(list1);
        ListUtil.addAll1(list1,5,6,7,8);
        System.out.println(list1);

        /*3.   泛型接口   */
        //格式:修饰符 interface 接口名<类型>{}
        //方式1.实现类给出具体类型。 2.实现类延续泛型，创建对象时再确定。
        //1.
        Arrayslist2 list2=new Arrayslist2();//由于实现类已给出具体类型，这里不用再写数据类型
        list2.add("aaa");
        list2.add("bbb");
        //list2.add(123)--->类型不同会报错。

        //2.
        Arraylist3<Integer>list3=new Arraylist3<>();//创建对象时确定数据类型。
        list3.add(1);
        list3.add(2);


    }
}
