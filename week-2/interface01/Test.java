package interface01;

public class Test {
    public static void main(String[]args){
        pinplyer p=new pinplyer("zhangsan",15);
        System.out.println(p.getAge()+" "+p.getName());
        p.act();
        p.show();
    }
}
