public class Colorpoint extends point{
    private String color;
    public Colorpoint(int x,int y,String color){
        super(x,y);
        this.color=color;
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String tostring(){
        return String.format(("%d %d %s"),super.getX(),super.getY(),this.color);
    }
}
