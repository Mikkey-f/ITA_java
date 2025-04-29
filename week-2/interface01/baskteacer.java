package interface01;

public class baskteacer extends person{
    public baskteacer(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("教打篮球");
    }
}
