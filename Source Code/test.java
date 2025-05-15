package StringBuffer_;

import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = "";
        price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        int i = stringBuffer.lastIndexOf(".");
        for (int j = i - 3; j > 0; j-=3) {
            stringBuffer = stringBuffer.insert(j,",");
        }
        System.out.println(stringBuffer);
    }
}
