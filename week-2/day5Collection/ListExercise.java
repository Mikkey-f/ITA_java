package day5Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello"+i);
        }
        list.add(1,"韩顺平教育");
        //获取第五个元素
        Object o = list.get(4);
        //删除第6个元素
        list.remove(5);
        //将第7个元素修改
        list.set(6,"Tom");
        //迭代器遍历
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object ne = it.next();
            System.out.println(ne);
        }
    }
}
