public class Test06 {
    public static void main(String[] args) {
        Person tang=new Person("唐僧",new Horse());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passHouYanShan();
        tang.passRiver();
        tang.passHouYanShan();
        tang.passRiver();
    }
}
interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    public void work(){
        System.out.println("普通情况骑马");
    }
}
class Boat implements Vehicles{//接口抽象
    public void work(){
        System.out.println("遇到河坐船");
    }
}
class Plane implements Vehicles{
    public void work(){
        System.out.println("遇到火焰山坐飞机");
    }
}
class VehiclesFactory{//工厂模式
    private static final Horse horse=new Horse();//单例模式 饿汉式
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
class Person{
    private String name;
    private Vehicles vehicle;
    public Person(String name,Vehicles vehicle){
        this.name=name;
        this.vehicle=vehicle;
    }
    public void common(){
        if(!(vehicle instanceof Horse)) {
            vehicle = VehiclesFactory.getHorse();//直接从工厂里取
        }
        vehicle.work();
    }
    public void passRiver(){
        if(!(vehicle instanceof Boat)) {
            vehicle = VehiclesFactory.getBoat();
        }
        vehicle.work();
    }
    public void passHouYanShan(){
        if(!(vehicle instanceof Plane)){
            vehicle=VehiclesFactory.getPlane();
        }
        vehicle.work();
    }
}
