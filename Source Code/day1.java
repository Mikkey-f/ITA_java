public class day1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="sizhijun";
        p1.age=19;
        Person p2=p1;
        System.out.println(p2.name+"\n"+p2.age);
        p2.test();
        p2.age=20;
        p2=null;
        System.out.println(p1.age);
        p1.ss(100);
        int k=p1.he(10,100000);
        System.out.println(k);

    }
}
class Person{
    //属性
    String name;
    int age;
    //方法
    void test() {
        System.out.println("这是一个方法");
    }
    void speak(){
        System.out.println("我是一个好人");
    }
    void ss(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("1到n的和为"+sum);
    }
    int he(int a,int b){
        int res=a+b;
        return res;
    }
}