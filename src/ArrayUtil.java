public class ArrayUtil {
    private ArrayUtil(){};
    public static String printArr(int []arr){
        StringBuilder sc=new StringBuilder();
        sc.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sc.append(arr[i]);
            }
            else {
                sc.append(arr[i]).append(",");
            }
        }
        sc.append("]");
        return sc.toString();
    }
    public static double getAverage(double []arr){
        double sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/ arr.length;
    }
}