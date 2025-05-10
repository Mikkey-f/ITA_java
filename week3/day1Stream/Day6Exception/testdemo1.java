package Day6Exception;

public class testdemo1 {
    public static void main(String[]args){
        // 抛出处理:
        /*throws: 写在方法的定义处,表示声明一个异常,告诉调用者可能出现的异常。
          public void 方法()throws 异常名1，异常名2{
          }
          *编译时异常:必须要写。
          *运行时异常:可以不写。
         */
        //throw:写在方法内,结束方法,方法下面的代码不再执行。
        int []arr=new int[0];
        //需求:返回数组的最大值,并且判断数组不能为null或长度为0
        int maxn=0;
        try {
             maxn=getMax(arr);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }
        System.out.println("下面的代码是否执行");
        System.out.println(maxn);
    }
    public static int getMax(int[]arr) throws NullPointerException,ArrayIndexOutOfBoundsException{
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
}
