package homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class HomeWork {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}
class A extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            System.out.println((int) (Math.random()*100+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("A线程退出....");
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);
    public B(A a){
        this.a = a;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("输入你的指令Q");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q'){
                a.setLoop(false);
                System.out.println("B线程退出....");
                break;
            }
        }
    }
}