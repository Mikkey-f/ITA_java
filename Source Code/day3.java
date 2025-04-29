public class day3 {
    public static void main(String[] args) {
        Person1 a = new Person1();
        a.name = "sizhijun";
        a.age = 19;
        Tool my = new Tool();
        Person1 b = my.copy(a);
        System.out.println(a.age + "\n" + a.name);
        System.out.println(b.age + "\n" + b.name);
        System.out.println(b == a);
        my.recursion(10);
        int k = my.jie(5);
        System.out.println(k);
        Overload mc=new Overload();
        System.out.println(mc.calculate(1.1,1));
        System.out.println(mc.calculate(2.2,3.5));

    }
}

class Person1 {
    //属性
    String name;
    int age;
}

class Tool {
    //克隆对象
    //得到的新对象和原来的对象是两个独立的对象，只是属性相同
    Person1 copy(Person1 a) {
        Person1 b = new Person1();
        b.name = a.name;
        b.age = a.age;
        return b;
    }

    void recursion(int a) {
        //递归操作
        if (a > 2) {
            recursion(a - 1);
        }
        System.out.println("输出的数字是" + a);
    }

    int jie(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jie(n - 1);
        }
    }

}

class Overload {
    //重载方法演示
    double calculate(double a,int b){
        return a+b;
    }
    int calculate(int a,int b){
        return a+b;
    }
    double calculate(int a,double b){
        return a+b;
    }
    double calculate(double a,double b){
        return a+b;
    }


}