package threaduse;

/**
 * @author 司志俊
 * @version 1.0
 *
 * 通过实现接口Runnable 来开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.start();这里不能调用start
        //创建了Thread对象，把 dog对象（实现了Runnable），放入Thread
        Thread thread = new Thread(dog);
        thread.start();

        Tiger tiger = new Tiger();//实现了 Runnable
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{}
class Tiger extends Animal implements Runnable{//单继承，不能再继承Thread，所以实现Runnable接口
    @Override
    public void run() {
        System.out.println("老虎嗷嗷哦嗷嗷叫....");
    }
}

//线程代理类，模拟了一个极简的Thread
class ThreadProxy implements Runnable{
    private Runnable target = null;//属性，类型是 Runnable

    public ThreadProxy(Runnable target) {
        this.target = target;//动态绑定(运行内存Tiger)
    }

    public void start(){
        start0();//真正实现多线程的方法
    }

    public void start0(){
        run();
    }
    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }
}

class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {//普通方法
        while (true){
            System.out.println("小狗汪汪叫...hi"+(++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10){
                break;
            }
        }
    }
}