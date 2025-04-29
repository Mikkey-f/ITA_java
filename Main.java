import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 读取输入的字符串
        String st = scanner.nextLine();
        int boy = 0, girl = 0;
        // 遍历字符串，统计 boy 和 girl 的数量
        for (int i = 0; i < st.length(); i++) {
            if (i + 2 < st.length() && st.charAt(i) == 'b' && st.charAt(i + 1) == 'o' && st.charAt(i + 2) == 'y') {
                boy++;
            }
            if (i + 3 < st.length() && st.charAt(i) == 'g' && st.charAt(i + 1) == 'i' && st.charAt(i + 2) == 'r' && st.charAt(i + 3) == 'l') {
                girl++;
            }
        }
        // 输出结果
        System.out.println(boy);
        System.out.println(girl);
        scanner.close();
    }
}   