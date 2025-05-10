package InnerClass;


public class Exercise {
    public static void main(String[] args) {
        //当作实参直接传递
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("一幅名画");
            }
        });
        //传统方式
        f1(new Picture());
    }

    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}
//硬编码
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("一幅名画");
    }
}