package abstract_;

import abstract_.detail.Template;

public class TestTemplate {
    public static void main(String[] args) {
        A a = new A();
        a.calculateTime();
        new B().calculateTime();
    }
}

class A extends Template {
    public void job(){//实现了Tamplate的抽象方法job
        long sum=0;
        for (long i = 0; i < 1000000000; i++) {
            sum+=i;
        }
    }
}
class B extends Template{

    public void job() {
        long sum = 0;
        for (long i = 0; i < 10000000; i++) {
            sum *= i;
        }
    }
}