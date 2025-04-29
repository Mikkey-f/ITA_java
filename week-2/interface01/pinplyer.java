package interface01;

public class pinplyer extends person implements speakenglish{
    public pinplyer(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("打乒乓球");
    }



    @Override
    public void show() {
        System.out.println("说英语");
    }
}
