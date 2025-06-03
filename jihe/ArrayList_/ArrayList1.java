package ArrayList_;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //ArrayList 是线程不安全的，原因如下: 可以发现源码中没有 synchronized
        /*public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }*/

        ArrayList arrayList = new ArrayList();
        //注意: idea默认情况下，Debug显示的数据是简化后的,如果希望看到完整数据
        //需要做设置,
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 10; i < 15; i++) {
            arrayList.add(i);

        }
        arrayList.add(200);
        System.out.println(arrayList);
        ArrayList list1 = new ArrayList(8);
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }// 扩容到12.

    }
}
