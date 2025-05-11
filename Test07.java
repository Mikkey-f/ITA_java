public class Test07 {
    public static void main(String[] args) {
        Car car1=new Car(42);
        Car.Air air1=car1.new Air();
        air1.flow();
        Car car2=new Car(30);
        Car.Air air2=car2.new Air();
        air2.flow();
        Car car3=new Car(-1);
        Car.Air air3=car3.new Air();
        air3.flow();
        Car car4=new Car(4);
        Car.Air air4=car4.new Air();
        air4.flow();
        car4.setTemperatrue(-55);
        air4.flow();
    }
}
class Car{//汽车
    private int temperatrue;
    public Car(int temperatrue){
        this.temperatrue=temperatrue;
    }

    public void setTemperatrue(int temperatrue) {
        this.temperatrue = temperatrue;
    }

    public int getTemperatrue() {
        return temperatrue;
    }

    class Air{//空调
        public void flow(){
            if(temperatrue>40)
                System.out.println("吹冷风");
            else if(temperatrue<0)
                System.out.println("吹暖风");
            else
                System.out.println("关掉空调");
        }
    }
}