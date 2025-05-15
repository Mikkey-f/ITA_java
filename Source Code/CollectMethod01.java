package CollectMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CollectMethod01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        //add 添加单个元素
        list.add("sss");
        list.add(100);//list.add(new Integer(10));
        list.add(true);
        System.out.println("list="+ list);
        //remove 删除指定元素
        list.remove(0);//删除第一个元素
        list.remove(true);//指定删除某个元素
        System.out.println(list);
        //contains
        System.out.println(list.contains(100));
        //size获取元素个数
        System.out.println(list.size());
        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        //clear 清空
        //list.clear();
        //System.out.println("list="+ list);
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);
        //containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        //removeAll 删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
