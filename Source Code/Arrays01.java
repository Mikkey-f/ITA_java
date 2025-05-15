package Arrays_;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 曾彤飞
 * @version 1.0
 */
public class Arrays01 {
    public static void main(String[] args) {
        Integer[]  integers = {1,33,5,24,8};
        //普通排序
        Arrays.sort(integers);
        //sort 重载的，可以通过传入一个接口 Comparator 实现定制排序
        //传入两个参数 1.数组  2.实现了Comparator接口的匿名内部类 要求实现 compare方法
        //体现了接口编程的思想
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i1 - i2;
            }
        });
        System.out.println(Arrays.toString(integers));

        //利用二分查找法，要求排好序
        //不存在就返回 -(low + 1)
        int i = Arrays.binarySearch(integers, 9);
        System.out.println("i= "+i);//输出-4

        //copy 数组元素的复制
        //从integers 数组中，拷贝 integers.length 个元素到 newArr数组中
        //如果拷贝长度大于 integers.length，多的就为null
        //拷贝长度小于0，就抛出异常
        Integer[] newArr = Arrays.copyOf(integers,integers.length);
        System.out.println(Arrays.toString(newArr));

        Integer[] num = new Integer[]{2,4,1,8,6,};
        //用99去填充数组num
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] num1 = new Integer[]{2,4,1,8,6,6};
        boolean equals = Arrays.equals(num,num1);
        System.out.println(equals);

        //asList 将一组值，转换成list
        //aslist的编译类型 list(接口)
        //aslist的运行内存 class java.util.Arrays$ArrayList，是Arrays类的静态内部类
        List aslist = Arrays.asList(num1);
        System.out.println("asList=" + aslist);
        System.out.println("aslist的运行类型:"+ aslist.getClass());
    }
}
