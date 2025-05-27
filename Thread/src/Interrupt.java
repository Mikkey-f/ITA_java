//public class Interrupt {
//    public static void main(String[] args) {
//        T t=new T();
//        t.setName("老韩");
//        t.setPriority(Thread.MIN_PRIORITY);
//        t.start();
//        for(int i=0;i<5;i++){
//            try {
//                System.out.println("hi"+i);
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println(t.getName()+"的优先级是"+t.getPriority());
//        t.interrupt();
//    }
//}
//class T extends Thread{
//    @Override
//    public void run(){
//        while(true) {
//            int count=0;
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName() + " 吃包子~~~~ "+(++count));
//            }
//            try {
//                System.out.println("休眠中....");
//                Thread.sleep(20 * 1000);
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName() + "被interrupt了");
//            }
//        }
//    }
//}
