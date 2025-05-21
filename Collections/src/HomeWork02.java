import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork02 {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("jack",650);
        m.put("Tom",1200);
        m.put("smith",2900);
        System.out.println(m);
        m.put("jack",2600);
        System.out.println(m);
        Set keySet=m.keySet();
        for(Object key:keySet){
            m.put(key,(Integer)m.get(key)+100);
        }
        System.out.println(m);
        Set entrySet=m.entrySet();
        Iterator it=entrySet.iterator();
        while(it.hasNext()){
            Object o=it.next();
            Map.Entry entry=(Map.Entry)o;
            System.out.println(entry.getKey());
        }
        it=entrySet.iterator();
        while(it.hasNext()){
            Object o=it.next();
            Map.Entry entry=(Map.Entry)o;
            System.out.println(entry.getValue());
        }
    }
}

