package exception.homework;

/**
 * @author 司志俊
 * @version 1.0
 */
public class homework1 {
    public static void main(String[] args) {

        //验证输入参数个数是否正确
        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            //把收到的参数转成整数
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            double res = cal(n,m);
            System.out.println("计算结果是"+ res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        }
    }
    //计算两个数的商
    public static double cal(int n,int m){
        return n / m;
    }
}
