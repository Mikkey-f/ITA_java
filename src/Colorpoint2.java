public class Colorpoint2 extends point{
    private int age;
    public Colorpoint2(){};
    public Colorpoint2(int x,int y,int age){
        super(x,y);
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String tostring(){
        return String.format(("%d,%d,%d"),super.getX(),super.getY(),this.age);
    }
}
