public class CustomGenericsClass {
    public static void main(String[] args) {

    }
}
class Tiger<T,R,M>{
    String name;
    T t;
    R r;
    M m;
    //泛型数组不能初始化，只能声明，因为不知道要开辟多少空间，不同的数据类型要的空间不同
    //T[] ts=new T[8];方括号里面的8不可以要
    T[] ts;
    //public static R r2;泛型的属性不能是静态的,使用了泛型的方法也不能是静态的
//    public static R sayOut(){
//        System.out.println(r);
//        return r;
//    }
    public Tiger(String name,T t,R r,M m){
        this.name=name;
        this.t=t;
        this.r=r;
        this.m=m;
    }
    public void setT(T t){
        this.t=t;
    }
    public M getM(){
        return m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getT() {
        return t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public void setM(M m) {
        this.m = m;
    }
}