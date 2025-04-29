public class Hello {
    public static void main(String[] args){
        cat mao=new cat();
        mao.name="xiaohuang";
        mao.color="yellow";
        mao.age=4;
        mao.test();
        System.out.println("这是一只猫的信息"+mao.name+" "+mao.age+" "+mao.color);
    }

}
class cat{
    //属性
    String name;
    String color;
    int age;
    //方法
    void test(){
        System.out.println("这是一个test");
    }
}
