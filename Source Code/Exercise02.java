package InnerClass;

public class Exercise02 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();

        //1.传递的是实现了 Bell接口的匿名内部类
        //2.重写了ring
        //3.Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        }

        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴起床了");
            }

        });
    }
}

interface Bell {
    void ring();
}

class Cellphone {
    public void alarmClock(Bell bell) {
        System.out.println(bell.getClass());
        bell.ring();//动态绑定机制
    }
}