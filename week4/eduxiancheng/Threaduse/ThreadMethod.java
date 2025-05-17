package eduxiancheng.Threaduse;

/**
 *  常用方法第一组:
 *  1.setName 设置线程名称,使之与参数name相同
 *  2.getName 返回该线程名称
 *  3.start 使该线程开始执行,底层调用start0方法
 *  4.run 调用线程对象run方法
 *  5.setPriority 更改线程的优先级-->1:最低级  10：最高级
 *  6.getPriority 获取线程的优先级
 *  7.sleep   8.interrupt 中断线程-->指的是唤醒休眠线程
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();

        t.setName("狗");
        t.setPriority(1);
        t.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("hi");
        }
        t.interrupt();//唤醒t线程
    }
}
class T extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+" 在吃包子 "+i);
            }
            try {
                System.out.println(Thread.currentThread().getName()+"休眠中");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"被唤醒了");
            }
        }
    }
}
