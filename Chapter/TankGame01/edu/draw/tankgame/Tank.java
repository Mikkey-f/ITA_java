package edu.draw.tankgame;

public class Tank {
    private int x;//坦克的横坐标。
    private int y;

    public Tank() {
    }

    public Tank(int y, int x) {
        this.y = y;
        this.x = x;
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
