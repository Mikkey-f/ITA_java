package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 演示小球通过键盘控制上下左右的移动-->java的事件控制
 */
public class BallMove extends JFrame{
    MyPanel mp=null;
    public static void main(String[]args){
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp=new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口JFrame对象可以监听键盘事件，即可以监听面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//画板+画笔，画出小球
class MyPanel extends JPanel implements KeyListener {//监听器，监听键盘事件
    //为了让小球可以移动，把它左上角的坐标设为(x,y)

    int x=10;
    int y=10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }
    //监听有字符输出，该方法触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //某个键按下
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char) e.getKeyCode()+"被按下");

        //根据用户按下的不同键，来处理小球移动（上下左右）
        //在Java中，会给每个键分配一个值（int)
        if(e.getKeyCode()==KeyEvent.VK_DOWN){//键盘上向下的键对应的值
            y++;
        }else if(e.getKeyCode()==KeyEvent.VK_UP)//向上
        {
            y--;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){//向左
            x--;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){//向右
            x++;
        }
        //重绘面板
        this.repaint();
    }
    //某个键释放
    @Override
    public void keyReleased(KeyEvent e) {


    }

}
