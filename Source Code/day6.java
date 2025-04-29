public class day6 {
    public static void main(String[] args) {
        T t1 = new T("sizhijun", 19);
        T t2 = new T("sizhijun", 19);
        System.out.println(t1.compare(t2));
    }
}

class T {
    String name;
    int age;

    public T(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //使用this实现在一个构造器中使用另一个构造器
//    public T(){
//        this("sizhijun",19);//细节：使用this时this("sizhijun",19);语句必须放在第一句，否则会报错
//        System.out.println("构造器T（）被调用");
//    }
//    public T(String s,int a){
//        System.out.println("构造器T（String s,int a）被调用");
//    }
    boolean compare(T a) {
        if (this.name == a.name && this.age == a.age) {
            return true;
        } else {
            return false;
        }
    }
}
