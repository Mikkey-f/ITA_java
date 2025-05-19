import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 司志俊
 * @version 1.0
 */
public class collectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));
        col.add(new Book("小李飞刀","古龙",5.1));

        //使用增强for循环(理解为简化版本的 迭代器) 快捷方式：I
        for (Object book : col){
            System.out.println("book=" + book);
        }
        //增强for，也可以在数组使用
        int[] nums = {1,8,10,90};
        for (int i : nums){
            System.out.println("i=" + i);
        }
    }
}