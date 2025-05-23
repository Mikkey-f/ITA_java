package customgeneric;

import java.util.Map;

/**
 * @author 司志俊
 * @version 1.0
 */
public class customgeneric_ {
    public static void main(String[] args) {

    }
}
//1.Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2. T，R，E 泛型的标识符，可以有多个
//3.普通成员可以使用泛型
class Tiger<T,R,E>{
    String name;
    R r;
    T t;
    E e;
    //T[] ts = new T[8];//因为数组在new 时不能确定T的类型，就无法在内存开空间

    //static R r;
    //public static void m1(E e){}
    //因为静态是和类相关的，在类加载的时候，对象还没有创建
    //如果静态方法和静态属性使用了泛型，JVM就无法完成初始化

    public Tiger(String name, R r, T t, E e) {
        this.name = name;
        this.r = r;
        this.t = t;
        this.e = e;
    }

    public T f(T t){
        return t;
    }
}