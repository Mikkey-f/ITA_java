//public class Exit {
//    public static void main(String[] args) {
//        T t=new T();
//        t.start();//主线程启动子线程t
//        //主线程开始休眠
//        try {
//            Thread.sleep(10*1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //10s后休眠结束
//        System.out.println("主线程休眠10s");
//        t.setLoop(false);//立即停止
//    }
//}
//class T extends Thread{
//    private int count=0;
//    boolean loop=true;
//    @Override
//    public void run(){
//        while(loop){
//            System.out.println("hhh"+" "+(++count));
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    public void setLoop(boolean loop){
//        this.loop=loop;
//    }
//}