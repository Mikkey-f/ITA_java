package eduxiancheng.Threaduse;

/**
 * 实现Runnable接口,底层使用了静态代理模式
 */
public class Thread02Runnable {
    public static void main(String[] args) {
         Dog dog=new Dog();
         //dog.start 无法调用
        //创建Thread对象,把dog对象(实现Runnable),放入Thread中
        Thread thread=new Thread(dog);
        thread.start();

        Threadproxy threadproxy=new Threadproxy(dog);
        threadproxy.start();

    }
}
//模拟代理模式
class Threadproxy implements Runnable{
    private Runnable target=null;
    @Override
    public void run() {
        if(target!=null){
            target.run();
        }
    }
    public Threadproxy(Runnable target){
        this.target=target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}
class Dog implements Runnable{

    @Override
    public void run() {//普通方法
        int cnt=0;
        while (true){
            System.out.println("狗正在叫"+(++cnt)+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(cnt==10){
                break;
            }
        }

    }
}