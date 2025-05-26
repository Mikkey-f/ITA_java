package method;

/**
 * @author  司志俊
 * @version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //希望当主线程结束后，子线程自动结束
        //将子线程设置为守护线程
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1; i <= 10; i++){//无线循环
            System.out.println("hardwork...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyDaemonThread extends Thread{
    @Override
    public void run() {
        for (; ; ){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hhhhhhhh.....");
        }
    }
}