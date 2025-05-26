package homework;

/**
 * @author 司志俊
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        T t = new T();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class T implements Runnable {
    private int money = 10000;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (money >= 1000) {
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() + " 取出了1000 当前余额= " + money);
                } else {
                    System.out.println("余额不足");
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}