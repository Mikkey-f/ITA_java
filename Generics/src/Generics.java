import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list=new ArrayList();
        List<Object> list1=new ArrayList();
        List<AA> list2=new ArrayList<>();
        List<BB> list3=new ArrayList<>();
        List<CC> list4=new ArrayList<>();
        List<String> list5=new ArrayList<>();
        printCollection01(list);
        printCollection02(list);
        printCollection03(list);
    }
    public static void printCollection01(List<?> list){
        for(Object o:list)
            System.out.println(o);
    }
    public static void printCollection02(List<? extends AA> list){
        for(AA aa:list){
            System.out.println(aa);
        }
    }
    public static void printCollection03(List<? super BB> list){
        for(Object o:list){
            System.out.println(o);
        }
    }
}
class AA{

}
class BB extends AA{

}
class CC extends BB{

}