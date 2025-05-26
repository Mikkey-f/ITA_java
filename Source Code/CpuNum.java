package cpu_;

/**
 * @author 司志俊
 * @version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的cpu数
        int cpuNums = runtime.availableProcessors();
        System.out.println("当前cpu数=" + cpuNums);
    }
}
