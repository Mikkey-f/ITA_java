import java.util.*;

public class HashMap01 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("no1","韩顺平");
        map.put("no2","张无忌");
        map.put("no1","蔡徐坤");
        map.put("no4","蔡徐坤");
        System.out.println(map);
        System.out.println(map.get("no1"));
        System.out.println(map.get("no2"));
        map.put("邓超","孙俪");
        map.put("马蓉","宋喆");
        System.out.println(map);
        System.out.println("============================");
        map.remove("邓超");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsValue("蔡徐坤"));
        System.out.println("==============================");
        //方法1 取出所有key，用实现set接口的来存放
        Set keyset=map.keySet();


        for(Object key:keyset){
            System.out.println(key+"-"+map.get(key));
        }
        //方法2：取出所有key,然后迭代器
        Iterator i=keyset.iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(key+"->"+map.get(key));
        }
        //方法3.取出所有values，values不能反向取key
        Collection values=map.values();
        for(Object o:values){
            System.out.println(o);
        }
        Iterator it=values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //方法4, 使用entrySet来获取k-v
        Set entrySet=map.entrySet();//这个Set存储的元素是一对一对的
        for(Object entry:entrySet){//把这些元素一对一对地取出来
            Map.Entry m=(Map.Entry) entry;//转成Map.Entry类型
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        it=entrySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getClass());
            Map.Entry m=(Map.Entry)it.next();
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
