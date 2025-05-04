package day6Generics;

import java.util.ArrayList;

//定义一个工具类，在类中定义一个静态方法addAll,用来添加多个集合的元素。
public class ListUtil {
    private ListUtil(){}
    public static<E> void addAll(ArrayList<E>list,E...e){
        for (E element:e){
            list.add(element);
        }
    }
    public static<E> void addAll1(ArrayList<E>list,E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }

}
