package customgeneric;

/**
 * @author 司志俊
 * @version 1.0
 */
public class CustomInterfaceGeneric_ {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R>{
    int n = 100;
    //U name;//错误，不能这样使用
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u){
        return null;
    }
}
interface IA extends IUsb<String,Double>{}

//当我们去实现IA接口时，IA在继承IUsb 接口时，指定了U 为String R为Double
//所以在实现IUsb接口方法时，U R会被替换
class A implements IA{
    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public Double get(String s) {
        return 0.0;
    }
}

//直接指定泛型接口的类型
class BB implements IUsb<Integer,Float>{
    @Override
    public Float get(Integer integer) {
        return 0f;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
abstract class CC implements IUsb{}