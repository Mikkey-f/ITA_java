package Vector_;

import java.util.Arrays;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        //1.无参构造
        //2.有参构造
        Vector v1 = new Vector(8);
        Vector ve = new Vector();
        for (int i = 0; i < 10; i++) {
            ve.add(i);
        }
        ve.add(200);
        //1.new Vector() 底层:
       /*
        public Vector() {
            this(10);
        }
        补充: 如果是 Vector v1 = new Vector(8);
             走的方法: public Vector(int initialCapacity) {
        this(initialCapacity, 0);
    }

          2.vector.add(i)
          2.1 //下面这个方法就是添加数据到Vector集合
          public synchronized boolean add(E e) {
        modCount++;
        add(e, elementData, elementCount);
        return true;
       }

          2.2 //确认是否需要扩容
          public synchronized void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            modCount++;
            if (minCapacity > elementData.length)
                grow(minCapacity);
        }
      }
         2.3 //如果需要的数组大小不足, 则扩容
         private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = ArraysSupport.newLength(oldCapacity,
                minCapacity - oldCapacity,  minimum growth
        capacityIncrement > 0 ? capacityIncrement : oldCapacity
         preferred growth );
        return elementData = Arrays.copyOf(elementData, newCapacity);
       }
       */

    }
}
