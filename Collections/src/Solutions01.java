import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solutions01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Jackeey");
        list.add("Smith");
        list.add("Lisa");
        list.add("Marryy");
        list.add("Marryy");
        list.add("Marryy");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,new Comparator(){
            public int compare(Object o1,Object o2){
                String s1=(String)o1;
                String s2=(String)o2;
                return s2.length()-s1.length();
            }
        });
        System.out.println(list);
        Collections.swap(list,0,2);
        System.out.println(list);
        System.out.println(Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1=(String)o1;
                String s2=(String)o2;
                return s1.length()-s2.length();
            }
        }));
        System.out.println(Collections.frequency(list,"Marryy"));
        System.out.println("======================");
        ArrayList des=new ArrayList();
        for(int i=0;i<=list.size()+1;i++){
            des.add("哈哈哈");
        }
        Collections.copy(des,list);
        System.out.println(des);
        Collections.replaceAll(list,"Marryy","玛丽");
        System.out.println(list);
    }
}
