package edu.draw.tankgame;

import javax.swing.*;

public class TankGame extends JFrame {
    Mypanel mp=null;
    public static void main(String[]args){
        TankGame tankGame = new TankGame();
    }
    public TankGame(){
        mp=new Mypanel();
        this.add(mp);//游戏的绘图区域
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
