package map_;

import java.util.*;
import java.util.HashMap;

/**
 * @author 司志俊
 * @version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("林海明","null");
        map.put("null","李鑫瑶");

        //第一组.先取出所有的key，通过key取value
        Set keySet = map.keySet();
        //1.增强for
        for (Object key : keySet) {
            System.out.println(key+"-"+map.get(key));
        }
        //2.迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的values取出
        Collection values = map.values();
        //这里可以使用所有的Collections使用的遍历方法
        for (Object value : values) {
            System.out.println(value);
        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

     //第三组：通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet();
        //1.增强for
        for (Object entry : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //2.迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //System.out.println(entry.getClass());//HashMap$Node -实现-> Map.Entry (getKey,getValue)
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
