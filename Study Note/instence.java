package exception.try_;

import java.util.Scanner;

/**
 * @author 司志俊
 * @version 1.0
 */
public class instence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            try {
                System.out.println("请输入一个整数：");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的整数是：" + num);
    }
}
