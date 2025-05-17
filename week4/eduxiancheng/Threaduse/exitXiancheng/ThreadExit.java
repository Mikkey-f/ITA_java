package eduxiancheng.Threaduse.exitXiancheng;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t1=new T();
        t1.start();

        //如果希望 main线程去控制t1线程的终止,必须可以修改 loop
        //让t1退出run方法,从而终止t1线程---->通知方式

        //让主线程休眠5s
        Thread.sleep(5*1000);
        t1.setLoop(false);
    }
}
class T extends Thread{
    int cnt=0;
    //设置一个控制变量
    private  boolean loop=true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello!"+(++cnt));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}