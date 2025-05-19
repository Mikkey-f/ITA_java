import java.util.ArrayList;
import java.util.List;

public class CollectiongSolutions01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("jack");
        System.out.println(list);
        System.out.println(list.contains("jack"));
        System.out.println(list.contains(true));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        //list.clear();
        System.out.println(list);
        ArrayList list2=new ArrayList();
        list2.add("hlm");
        list2.add(1999);
        list.addAll(list2);
        System.out.println(list);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list);
    }


}
