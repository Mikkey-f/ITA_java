package eduxiancheng.ThreadPractice;

import java.util.Random;
import java.util.Scanner;

public class ThreadPractice1 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B(a);
        a.start();
        b.start();

    }
}
class A extends Thread{
    boolean loop=true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        Random r = new Random();
            while (loop){

                System.out.println(r.nextInt(100));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        System.out.println("退出a线程");
    }
}
class B extends Thread{
    private A a;
    private Scanner sc=new Scanner(System.in);
    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("请输入Q来结束线程");
            String s=sc.next().toUpperCase();
            if(s.equals("Q")){
                 a.setLoop(false);
                 System.out.println("退出b线程");
                 break;
            }
        }
    }
}