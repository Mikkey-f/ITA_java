package eduxiancheng.Threaduse;

/**
 *
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat=new Cat();//创建Cat对象
        cat.start();
        //说明:当main线程启动一个子线程Thread-0,主线程不会阻塞,会继续执行
        //这时主线程和子线程交替执行。。。
        for (int i = 0; i < 8; i++) {
            System.out.println("dsadsa");
            try {
                //让主线程休眠
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
//1.当一个类继承了Thread类,该类就可以当作线程使用
//2.重写run方法，写上自己的业务代码
//3.run Thread类实现了 Runnable接口的run方法。
class Cat extends Thread{
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        int times=0;
        while (true){
            System.out.println("orzorz"+(++times));
            try {
                //该线程每个1秒输出一次
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(times==8){
                break;
            }
        }
    }

}
