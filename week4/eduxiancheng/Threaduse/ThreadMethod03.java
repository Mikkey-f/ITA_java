package eduxiancheng.Threaduse;

/**
 *  线程的常用方法
 *  用户线程和守护线程:
 *  1.用户线程:也叫工作线程,当线程的任务执行完或通知方式结束
 *  2.守护线程:为工作线程服务,当所有的用户线程结束,守护线程自动结束。(例:垃圾回收机制)
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        //将子线程设置为守护线程,如果我们希望main线程结束后子线程自动结束。
        people p1 = new people();
        p1.setDaemon(true);
        p1.start();
        for(int i=1;i<=10;i++){
            Thread.sleep(1000);
            System.out.println("hello!");
        }
    }
}
class people extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hihihi");
        }
    }
}