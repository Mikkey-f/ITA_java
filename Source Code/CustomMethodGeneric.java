package customgeneric;

import java.util.ArrayList;

/**
 * @author 司志俊
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马",10000000);
        //当调用方法时，传入参数，编译器自动确定类型
        car.fly(1999,10.98);

        //测试
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),10.4f);
    }
}
class Car{
    public void run(){//普通
    }

    public<T,R> void fly(T t,R r){//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T,R>{
    public void run(){
    }

    public<M,S> void eat(M m,S s){
        System.out.println(m.getClass());
        System.out.println(s.getClass());
    }

    public<K> void hello(R r,K k){
        System.out.println(r.getClass());//class java.util.ArrayList
        System.out.println(k.getClass());//class java.lang.Float
    }
}