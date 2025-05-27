public class Homework02 {
    public static void main(String[] args) {
        User user=new User();
        Thread thread1=new Thread(user);
        thread1.setName("t1");
        Thread thread2=new Thread(user);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}
class User implements Runnable {
    public static int count = 10000;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {//线程同步 互斥锁
                if (count <= 0) {
                    System.out.println("钱已取完");
                    break;
                }
                count -= 1000;
                System.out.println("用户" + Thread.currentThread().getName() + "取了1000元，还剩" + count + "元");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
