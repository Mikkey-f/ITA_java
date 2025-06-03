package day5Collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        //1.List 集合类中元素有序（即添加顺序和取出顺序一致）,且可重复
        List list=new ArrayList();
        list.add("hsp");
        list.add("Tom");
        list.add("moose");
        list.add("Tom");
        System.out.println(list);
        //2.List集合的每个元素都有对应的顺序索引,即支持索引(索引从0开始）
        System.out.println(list.get(3));//Tom
        //3，Api中List接口的实现类有很多,常用的:ArrayList,LinkedList,Vector

    }
}
