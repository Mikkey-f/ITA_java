package customgeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 司志俊
 * @version 1.0
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");//ok

        //List<Object> list = new ArrayList<String>();错误
        // 泛型没有继承性

        //举例说明三个方法的使用
        List<Object> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<H> list3 = new ArrayList<>();
        List<B> list4 = new ArrayList<>();
        List<S> list5 = new ArrayList<>();
        //1.
        p(list);
        p(list2);
        p(list3);
        p(list4);
        p(list5);
        //2.
        //p2(list);
        //p2(list2);
        p2(list3);
        p2(list4);
        p2(list5);
        //3.
        p3(list);
        //p3(list2);
        p3(list3);
        //p3(list4);
        //p3(list5);
    }

    //List<?> 表示任意的泛型类型都可以接收
    public static void p(List<?> c){
        for (Object object : c) {// 通配符，取出时就是Object
            System.out.println(object);
        }

    }

    //? extends H 表示上限，可以接收 H或者H子类
    public static void p2(List<? extends H> c){
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //? super 子类类名H：支持H类以及H类的父类，不限于直接父类
    //规定了泛型的下限
    public static void p3(List<? super H> c){
        for (Object object : c) {
            System.out.println(object);
        }
    }
}
class H{
}
class B extends H{

}
class S extends B{

}