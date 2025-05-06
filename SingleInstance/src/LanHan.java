public class LanHan {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat cat=Cat.getInstance();
        System.out.println(cat);
        Cat cat1=Cat.getInstance();
        System.out.println(cat1);
    }
}
class Cat{
    private String name;
    static int n1=100;
    private static Cat cat=null;//声明一个
    private Cat(String name){
        this.name=name;
    }
    public static Cat getInstance(){
        if(cat==null)
            cat=new Cat("小可爱");
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}