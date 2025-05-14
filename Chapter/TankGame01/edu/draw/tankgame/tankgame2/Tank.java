package tankgame2;

public class Tank {
    private int x;//坦克的横坐标。
    private int y;
    private int direct;//坦克方向 0 1 2 3
    private int speed=1;//移速
    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank() {
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //上右下左移动方法
    public void moveup(){
        y-=speed;
    }
    public void moveright(){
        x+=speed;
    }
    public void movedown(){
        y+=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void moveleft(){
        x-=speed;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
