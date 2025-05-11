import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        String s;
        while(true) {
            System.out.println("请输入一个整数:");
            s = scanner.next();
            try {
                num = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入");
                scanner.nextLine();
            }
        }
            System.out.println("你输入的数字为：" + num);
    }
}
