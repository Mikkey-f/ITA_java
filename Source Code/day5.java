public class day5 {
    public static void main(String[] args) {
        Fish yu = new Fish( 11);
        //验证this和yu指向同一个对象
        System.out.println("yu的hashCode=" + yu.hashCode());
        yu.f2();
        yu.f3();
    }

}

class Fish {
    String lei = "sizhijun";
    int weight = 19;

    /*    public Fish(String flei,int fw){
            lei=flei;
            weight=fw;
        }
    */
    //如果我们的构造器的形参能直接写成属性名就更好了
    //构造器的lei weight是局部变量而不是属性
    //引出this
    public Fish( int weight) {
        this.weight = weight;
        System.out.println("this的hashCode=" + this.hashCode());
    }

    void f1() {
        System.out.println("f1被调用");
    }

    void f2() {
        System.out.println("f2被调用");
        //想在f2中调用f1，两种办法
        f1();
        this.f1();
    }
    void f3(){
        String lei="fangyao";
        System.out.println("lei="+lei+"\n"+"weight="+weight);//遵从就近原则输出的lei为“fangyao”
        System.out.println("lei="+this.lei+"\n"+"weight="+this.weight);//只会输出属性lei，不管有无局部lei
    }
}


