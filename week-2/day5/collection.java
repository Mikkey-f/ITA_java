package day5;

import java.util.ArrayList;
import java.util.Collection;

public class collection {
    public static void main(String[]args){
        //collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用。
        //collection是一个接口，我们不能直接创建它的对象，只能创建它的类对象。
        Collection<String> coll=new ArrayList<>();
        //1.添加元素（public boolean add(E e)) 往list中添加数据，返回值永远是true，往set中添加数据，若数据已存在，返回false，因为set中
        //不能有重复元素。
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);//aaa bbb ccc
        //coll.clear();//2.清空元素
        //System.out.println(coll);//null

        //3.移除给定对象 （public boolean remove(E e))
        coll.remove("aaa");
        System.out.println(coll);// bbb ccc;

        //4.判断当前集合是否包含给定对象。public boolean contains(Object obj)
        //注意点1:contains方法在底层依赖equals方法判断对象是否一致。
        //2.如果存的是自定义对象，没有重写equals方法，默认使用Object类中的equals方法进行判断，而Object类中的equals方法依赖地址值。
        Collection<Student> coll1=new ArrayList<>();
        Student s1=new Student("zhangsan",14);
        Student s2=new Student("lisi",15);
        Student s3=new Student("wangwu",16);
        coll1.add(s1);
        coll1.add(s2);
        coll1.add(s3);
        Student s4=new Student("zhangsan",14);
        //System.out.println(coll1.contains(s4)); 若未重写equals方法，返回false。
        System.out.println(coll1.contains(s4));// 重写后：true。

        //5.判断当前集合是否为空（public boolean isEmpty)
        boolean y1=coll1.isEmpty();
        System.out.println(y1);

        //6.返回当前集合长度。（int size)
        int cnt=coll1.size();
        System.out.println(cnt);
    }
}
