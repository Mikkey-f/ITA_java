package interface_.poly;

public class PolyArr {
    public static void main(String[] args) {

        Usb[] usbs =new Usb[2];
        usbs[0] =new Phone1();
        usbs[1] =new Camera1();
        //遍历
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();//动态绑定
            //要调用Phone1的特有的方法call
            //需要进行向下转型
            if (usbs[i] instanceof Phone1){//instanceof判断的是运行类型
                ((Phone1) usbs[i]).call();
            }
        }

    }
}
interface Usb{
    void work();
}
class Phone1 implements Usb{
    public void call(){
        System.out.println("手机可以打电话。。。。");
    }

    @Override
    public void work() {
        System.out.println("手机工作中。。。。");
    }
}
class Camera1 implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中。。。");
    }
}