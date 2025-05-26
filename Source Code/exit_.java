/**
 * @author 司志俊
 * @version 1.0
 */
public class exit_ {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.setLoop(false);
    }
}

class T extends Thread{
    //设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T 运行中，，，，");
        }
        }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}