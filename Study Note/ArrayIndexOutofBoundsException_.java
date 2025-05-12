package exception;

/**
 * @author 司志俊
 * @version 1.0
 */
public class ArrayIndexOutofBoundsException_ {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
