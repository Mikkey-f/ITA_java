package day5Collection;

import java.util.*;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //List接口的实现子类 Vector LinkedList也可以一样用。
        //List list=new ArrayList();
        //List list=new Vector();
        List list=new LinkedList();
        list.add("tom");
        list.add("hsp");
        list.add("烤鸭");

        //1.迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
        //2.增强for
        for (Object o : list) {
            System.out.println(o);
        }
        //3.普通for
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
