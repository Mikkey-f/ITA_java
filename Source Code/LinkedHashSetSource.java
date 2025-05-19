package Set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author 司志俊
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("szj", 1001));
        set.add(123);
        set.add("HSP");
        System.out.println("set=" + set);
        //LinkedHashSet 加入和取出元素/数据的顺序一致
        //LinkedHashSet 底层维护的是一个LinkedHashMap
        //LinkedHashSet 底层结构 (数组table+双向链表)
        //第一次添加时，直接将 数组table扩容到16，存放的结点类型是LinkedHashMap$Entry
        //数组类型是 HashMap$Node 存放的元素是 LinkedHashMap$Entry类型
    }
}

class Customer {
    String name;
    int num;

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}