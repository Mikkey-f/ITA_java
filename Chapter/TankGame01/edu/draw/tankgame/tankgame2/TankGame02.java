package tankgame2;

import javax.swing.*;
import java.awt.event.KeyListener;

public class TankGame02 extends JFrame {
    Mypanel mp=null;
    public static void main(String[]args){
        TankGame02 tankGame = new TankGame02();
    }
    public TankGame02(){
        mp=new Mypanel();
        this.add(mp);//游戏的绘图区域
        this.addKeyListener(mp);//让JFrame监听mp的键盘事件s
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
