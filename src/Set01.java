import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("小明");
        set.add("小红");
        set.add("小明");
        set.add("韩顺平");
        set.add("成都理工");
        set.add(null);
        set.add(null);
        System.out.println(set);
        Iterator i=set.iterator();
        while(i.hasNext()!=false){
            System.out.println(i.next());
        }
        System.out.println("===========");
        for(Object obj:set){
            System.out.println(obj);
        }
        set.remove("cxk");
        System.out.println();
    }
}
