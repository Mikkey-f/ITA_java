package tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 司志俊
 * @version 1.0
 * 坦克大战的绘图区
 */

//为了监听减半事件，实现KeyListener
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
    //定义敌人坦克，放入Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(200, 200, 0);//初始化自己的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建对象
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //设置方向
            enemyTank.setDirect(2);
            //放入集合
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形，默认黑色

        //画出坦克-封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        //画出敌人坦克，遍历Vector
        for (int i = 0; i < enemyTankSize; i++) {
            //取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }
    }

    //编写方法，画出坦克

    /**
     * @param x      坦克左上角横坐标
     * @param y      坦克左上角纵坐标
     * @param g      画笔
     * @param direct 坦克方向（上下左右）
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //设置颜色
        switch (type) {
            case 0: //我们的坦克
                g.setColor(Color.pink);
                break;
            case 1: //敌人的坦克
                g.setColor(Color.cyan);
                break;
        }
        //根据坦克方向，来绘制坦克
        //direct 表示方向（0-上，1-右，2-左，3右）
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: // 向右
                g.fill3DRect(x, y, 60, 10, false);      // 坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);     // 画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 画出炮筒
                break;
            case 2: // 向下
                g.fill3DRect(x, y, 10, 60, false);      // 坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false);  // 坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);     // 画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); // 画出炮筒
                break;
            case 3: // 向左
                g.fill3DRect(x, y, 60, 10, false);      // 坦克上边的轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 坦克下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);     // 画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);  // 画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wasd 键按下的情况
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下W键
            //改变坦克方向
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A
            hero.setDirect(3);
            hero.moveLift();
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
