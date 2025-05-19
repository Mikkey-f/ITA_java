package list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 司志俊
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        //1
        List list = new ArrayList();
        list.add("jack");
        list.add("fy");
        list.add("szj");
        list.add("fy");//可以重复
        System.out.println("list="+list);

        //2~3.
        //索引从零开始
        System.out.println(list.get(3));

    }
}
