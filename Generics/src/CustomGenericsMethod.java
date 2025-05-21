import java.util.ArrayList;

public class CustomGenericsMethod {
    public static void main(String[] args) {
        Car car=new Car();
        car.fly("宝马",12.4);
        Fish<ArrayList,String> fish=new Fish<>();
        fish.hello(new ArrayList(),14);
    }
}
class Car{
    public void run(){

    }
    public<T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}
class Fish<T,R>{
    public void swim(){

    }
    public<U,M> void eat(U u,M m){

    }
    public<U> void hello(T t,U u){
        System.out.println(t.getClass());
        System.out.println(u.getClass());
    }
}

