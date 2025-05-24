package draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author 司志俊
 * @version 1.0
 */
public class DrawCircle extends JFrame{//JFrame对应一个窗口，理解为画框
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放入窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1.先定义一个面板MyPanel，继承JPanel类，在面板上画图形
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//绘图方法
        //System.out.println("paint方法被调用");
        super.paint(g);//调用父类的方法完成初始化
        //画出一个圆形
        //g.drawOval(10,10,100,100);

        //演示绘制不同的图形...
        //画直线
        //g.drawLine(10,10,100,100);
        //画矩形边框
        g.clearRect(10,10,100,100);

        //填充矩形
        g.fillRect(10,10,100,100);

        //画图片
        //1.获取图片资源 /bg.png 表示在该项目的根目录去获取 bg.png 图片资源
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        //g.drawImage(image,10,10,175,221,this);

        //画字符串
        //设置画笔的颜色和字体
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.setColor(Color.red);
        g.drawString("hello java",100,100);//（100,100）是字符串的左下角
    }
}