public class day4 {
    public static void main(String[] args) {
        Variable q = new Variable();
        System.out.println(q.sum(1, 2, 3));
        int[] arr = {1, 2, 3, 4};
        System.out.println(q.sum(arr));
        q.aa("sizhijun", 1, 1, 1);
        Student si = new Student();
        si.zi();
        Y fy = new Y();
        fy.f();
        fy.f1(si);
        Person2 szj = new Person2("sizhijun", 19);
        Person2 fyy = new Person2("fangyao");

    }
}

class Variable {
    //计算2个，3个，4个...数字的和
    //可以用方法重载但很不方便
    //功能相同但参数个数不同->使用可变参数优化
    //传入参数可以为数组
    //使用时a可以当作数组来使用
    //遍历a求和即可
    public int sum(int... a) {
        System.out.println("接收的参数个数=" + a.length);
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    public void aa(String s, int... a) {
        System.out.println(s);
    }
}

class Cat {
    //全局变量也就是属性，作用域为整个Cat类体：eat等方法可以使用属性
    //全局变量可以不赋值直接使用，因为有默认值
    //属性
    String name;//默认值null
    int age;//默认值0
    double weight;//0.0

    void eat() {
        //局部变量一般指在成员方法中定义的变量，如food和num
        //food和num的作用域就在eat方法中，即
        String food;//无默认值
        int num;//无默认值
        //System.out.println("num="+num);//错误
    }

    void play() {
        System.out.println(age);
        //System.out.println(food);错误
    }

}

class Student {
    String name;
    int num;

    public void zi() {
        String name = "shizhijun";
        System.out.println("输出的name是" + name);
    }
}

class Y {
    void f() {
        Student fyy = new Student();
        System.out.println(fyy.name);
    }

    void f1(Student f) {
        System.out.println(f.name + "\t");
    }

}

class Person2 {
    String name;
    int age;
    //构造器
    //1.没有返回值（不能写void）
    //2.名称和类名Person2一样

    public Person2(String pname, int page) {
        System.out.println("构造器被调用" + "\n" + "完成对象的初始化");
        name = pname;
        age = page;
    }//构造器1

    public Person2(String pname) {
        System.out.println("构造器被调用" + "\n" + "完成对象的初始化");
        name = pname;
    }//构造器2

    //如果没有自己定义构造器，系统会自动生成一个默认无参构造器
    //用Javap反编译看看
    Person2(){//显式定义无参构造器

    }//构造器3

}





