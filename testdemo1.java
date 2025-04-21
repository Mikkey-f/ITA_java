public class testdemo1 {
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        String sb=ArrayUtil.printArr(arr);
        System.out.println(sb);
        double []arr1={2.1,3.1,4.1,3.1,2.1};
        double average=ArrayUtil.getAverage(arr1);
        System.out.println(average);
    }
}
