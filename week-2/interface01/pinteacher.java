package interface01;

public class pinteacher extends person implements speakenglish{
    public pinteacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void act() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void show() {
        System.out.println("说英语");
    }
}
