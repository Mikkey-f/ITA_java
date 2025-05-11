package edu.draw;
import javax.swing.*;
import java.awt.*;
public class DrawCircle extends JFrame{//JFrame对应窗口，可理解成一个画框
    //定义一个面板
    private MyPanel mp=null;
    public DrawCircle(){
        mp=new MyPanel();
        this.add(mp);//把面板放到画框
        this.setSize(400,300);//设置窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//界面关闭后程序随之停止，不加上程序停止不了
        this.setVisible(true);//可视化
    }//初始化面板
    public static void main(String[]args){
        new DrawCircle();
    }
}
//先定义一个MyPanel,继承JPanel,画图，在面板上画。
class MyPanel extends JPanel{
    @Override
    //说明:MyPanel对象是一个画板。
    //2.Graphics g：把 g理解成一支画笔。
    public void paint(Graphics g) {
        super.paint(g);//调用父类方法完成初始化
        //g.drawOval(10,10,100,100);//画一个圆形 x:圆的左上角。
        //  画直线
       //g.drawLine(10,10,100,100);
        //  画矩形边框
        //g.drawRect(10,10,100,100);
        //  填充矩形 1.设置画笔颜色
        //g.setColor(Color.BLUE);
        //g.fillRect(10,10,100,100);
        //  填充椭圆 fillOval
        //g.setColor(Color.red);
        //g.fillOval(10,10,50,100);
        //画图片 drawImage()
        //1.获取图片资源
        //Image image=Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.jpg"));// '/'表示到项目的根目录去找文件bg.jpg图片
        //g.drawImage(image,10,10,1080,1080,this);//this:当前位置。

        //画字符串 drawString(String str,int x,.....)//写字
        //设置颜色和字体
        //g.setColor(Color.BLUE);
        //g.setFont(new Font("隶书",Font.BOLD,50));//Bold:粗体,   大小。
        //g.drawString("北京",100,100);//细节: x:100-->左下角.

        //Tank
        g.setColor(Color.BLUE);

    }
}
