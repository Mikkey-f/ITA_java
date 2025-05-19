import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("hhh");
        list.add("hjk");
        list.add("hsp");
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(1,"ljw");
        System.out.println(list);
        list.add("cxk");
        System.out.println(list);
        System.out.println(list.indexOf("hsp"));
        System.out.println(list);
        list.add("cxk");
        System.out.println(list.lastIndexOf("cxk"));
        System.out.println(list.remove(0));
        list.set(0,"yyy");
        System.out.println(list);
        List res=list.subList(0,3);//从0开始，到索引3停止 左闭右开
        System.out.println(res);
        list.add(null);
        System.out.println(list);
    }
}
