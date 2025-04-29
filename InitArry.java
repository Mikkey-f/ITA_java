import java.util.Scanner;

public class InitArry {
    public static void main(String[] args) {
        // 创建 Scanner 对象用于读取用户输入
        Scanner scanner = new Scanner(System.in);
        // 定义一个长度为 5 的整型数组
        int[] array = new int[5];

        System.out.println("请输入 5 个整数：");
        // 循环读取用户输入的 5 个整数，并存储到数组中
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("你输入的 5 个整数是：");
        // 循环输出数组中的元素
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }

        // 关闭 Scanner 对象，释放资源
        scanner.close();
    }
} 