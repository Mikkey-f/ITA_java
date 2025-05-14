package tankgame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Vector;

//绘图区。
public class Mypanel extends JPanel implements KeyListener {//定义我的坦克
    Hero hero=null;
    Vector<EnemyTank>enemyTanks=new Vector<>();//定义敌人坦克,放到Vector中。--->处理多线程问题
    int enemyTankSize=3;
    public Mypanel(){
        hero=new Hero(100,100);
        //初始化自己的坦克
        hero.setSpeed(1);//设置移速
        for (int i = 0; i <enemyTankSize ; i++) {
            //创建一个敌人坦克。
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //设置方向
            enemyTank.setDirect(2);
            //添加到集合中
            enemyTanks.add(enemyTank);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认为黑色。
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);//0:向上 1:自己的坦克
        //drawTank(hero.getX()+60,hero.getY(),g,0,0);
        for(EnemyTank s:enemyTanks){
            drawTank(s.getX(),s.getY(),g,s.getDirect(),0);
        }

    }
    //画出坦克-封装方法

    /**
     *
     * @param x 坦克左上角
     * @param y
     * @param g  画笔
     * @param direct 方向（上下左右） 0:向上
     * @param type 坦克种类
     *
     */
    //为了监听键盘事件 ,实现KeyListener
    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 1:
                g.setColor(Color.yellow);//我方坦克
                break;
            case 0://敌方坦克
                g.setColor(Color.cyan);
                break;
        }
        //根据坦克方向,绘制对应形状的坦克
        //0:向上 1:向右 2:向下 3:向左
        switch (direct){
            case 0://向上
                g.fill3DRect(x,y,10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克盖子
                g.fillOval(x+10,y+20,20,20);//画出圆盖
                g.drawLine(x+20,y+30,x+20,y);//画出炮筒
                break;
            case 1://向右
                g.fill3DRect(x,y,60,10,false);//画出坦克上边的轮子
                g.fill3DRect(x,y+30,60,10,false);//画出下边的轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克盖子
                g.fillOval(x+20,y+10,20,20);//画出圆盖
                g.drawLine(x+30,y+20,x+60,y+20);//画出炮筒
                break;
            case 2://向下
                g.fill3DRect(x,y,10,60,false);//画出坦克左边的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出右边的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克盖子
                g.fillOval(x+10,y+20,20,20);//画出圆盖
                g.drawLine(x+20,y+30,x+20,y+60);//画出炮筒
                break;
            case 3://向左
                g.fill3DRect(x,y,60,10,false);//画出坦克上边的轮子
                g.fill3DRect(x,y+30,60,10,false);//画出下边的轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克盖子
                g.fillOval(x+20,y+10,20,20);//画出圆盖
                g.drawLine(x+30,y+20,x,y+20);//画出炮筒
                break;
            default:
                System.out.println("暂时不处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //处理W D S A按下的情况
    @Override
    public void keyPressed(KeyEvent e) {//改变坦克的方向,坦克的坐标.
        if(e.getKeyCode()==KeyEvent.VK_W)//按下W键
        {
            hero.setDirect(0);//向上
            hero.moveup();

        }else  if(e.getKeyCode()==KeyEvent.VK_A){//向左
            hero.setDirect(3);
            hero.moveleft();
        }else if(e.getKeyCode()==KeyEvent.VK_S){//向下
            hero.setDirect(2);
            hero.movedown();
        }else if(e.getKeyCode()==KeyEvent.VK_D){
            hero.setDirect(1);//向右
            hero.moveright();
        }
        this.repaint();//面板重绘,否则生成的图像不会变化。
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
