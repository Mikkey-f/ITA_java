package threaduse;

/**
 * @author 司志俊
 * @version 1.0
 * 演示通过继承Thread类创建线程
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //cat.run();//run方法就是一个普通的方法，没有真正的启动一个线程，把run方法执行完毕才向下执行
        cat.start();//启动线程
        //说明：当main线程启动一个子线程Thread-0，主线程不会阻塞，会继续执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());//main
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i="+i);
            try {
                //让主线程休眠
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//当一个类继承了Thread类，该类就可以当作线程使用
//重写run方法，写上自己的业务逻辑
//run Thread 类 实现了 Runnable 接口的方法
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true){
            times++;
            System.out.println("喵喵，我是小莫米"+times+ "线程名="+Thread.currentThread().getName());
            //让线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80){
                break;
            }
        }
    }
}