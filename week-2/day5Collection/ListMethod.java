package day5Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add("tom");
        list.add("moose");
        //1.void add(int index,Object eles):在index位置插入eles
        list.add(1,"hsp");
        System.out.println(list);
        //2.boolean addAll(int index,Collection eles):在index位置开始将eles中所有元素添加进来
        List list2= new ArrayList();
        list2.add("tom");
        list2.add("moose");
        list.addAll(1,list2);
        System.out.println(list);
        //3.Object get(int index):获取指定index位置的元素
        Object o = list.get(2);
        System.out.println(o);//moose
        //4. int index0f(Object obj): 返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("moose"));//2
        //5. int lastIndex0f(Object obj): 返回obj在集合中末次出现的位置
        System.out.println(list.lastIndexOf("moose"));//4

        //6. Object remove(int index): 移除指定index位置的元素,并返回此元素
        System.out.println(list.remove(3));//hsp
        System.out.println(list);
        //7.Object set(int index,Object ele):设置指定index位置的元素为ele, 相当于替换
        list.set(1,"汤姆");
        System.out.println(list);

        //8.List sublist(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的集合
        //是前闭后开的范围。fromIndex<=sublist<toIndex
        List returnlist1=list.subList(0,2);
        System.out.println(returnlist1);
    }
}
