package tankgame2;

import javax.swing.*;
import java.awt.*;

//绘图区。
public class Mypanel extends JPanel {//定义我的坦克
    Hero hero=null;
    public Mypanel(){
        hero=new Hero(100,100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认为黑色。
        drawTank(hero.getX(),hero.getY(),g,3,1);//0:向上 1:自己的坦克
        //drawTank(hero.getX()+60,hero.getY(),g,0,0);
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
}
