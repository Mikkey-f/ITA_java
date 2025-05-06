public class ErHan {
    public static void main(String[] args){
       GirlFriend gf=GirlFriend.getInstance();
        System.out.println(gf);
    }
}
class GirlFriend{
     private String name;
     private GirlFriend(String name){//私有
        this.name=name;
    }
    private static GirlFriend gf=new GirlFriend("小红红");//类内部定义一个类的对象，静态
    public static GirlFriend getInstance(){//共有 静态
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}