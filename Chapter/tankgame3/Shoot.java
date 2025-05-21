package tankgame3;

public class Shoot implements Runnable{
    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirect() {
        return direct;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isIslive() {
        return islive;
    }

    private int x;
    private int y;
    int direct=0;
    int speed=2;//子弹速度
    boolean islive=true;//子弹是否还存活
    public void setX(int x) {
        this.x = x;
    }

    public Shoot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void run() {
        while(true){
            //休眠线程
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //根据方向改变x,y坐标
            switch (direct){
                case 0: y-=speed;//上
                    break;
                case 1:x+=speed;//右
                    break;
                case 2:y+=speed;//下
                    break;
                case 3:x-=speed;//左
                    break;

            }
            if(!(x>=0&&x<=1000&&y>=0&&y<=750)){
                islive=false;
                break;
            }
            System.out.println("现在的x是"+x+" 现在的y是:"+y);
        }
    }
}
