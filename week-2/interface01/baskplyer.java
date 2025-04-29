package interface01;

public class baskplyer extends person{

    public baskplyer(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("打篮球");
    }
}
