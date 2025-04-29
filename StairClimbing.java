import java.util.ArrayList;//类
import java.util.List;//接口
import java.util.Scanner;

public class StairClimbing 
{
    // 高精度加法函数
    public static List<Integer> highAdd(List<Integer> prev1, List<Integer> prev2) 
    {
        List<Integer> res = new ArrayList<>();//Integer是int类型的包装类  new了一个ArrayList的对象
        int carry = 0; // 进位
        int temp = 0;  // 对应位相加的和
        int i = 0;
        while (i < prev1.size() || i < prev2.size())
        {
            temp += carry;
            if (i < prev1.size()) 
            {
                temp += prev1.get(i);
            }
            if (i < prev2.size()) 
            {
                temp += prev2.get(i);
            }
            res.add(temp % 10);
            carry = temp / 10;
            temp = 0;
            i++;
        }
        // 处理最后的可能的进位
        while (carry != 0) 
        {
            res.add(carry % 10);
            carry /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) 
        {
            System.out.println(1);
            return;
        }
        if (n == 2) 
        {
            System.out.println(2);
            return;
        }

        // 走到前两个台阶的位置的方法数
        List<Integer> prev2 = new ArrayList<>();
        prev2.add(1);
        // 走到前一个台阶的位置的方法数
        List<Integer> prev1 = new ArrayList<>();
        prev1.add(2);
        // 走到当前台阶位置的方法数，提前初始化
        List<Integer> now = new ArrayList<>(); 

        for (int i = 3; i <= n; i++) 
        {
            now = highAdd(prev1, prev2);
            prev2 = new ArrayList<>(prev1);//p1
            prev1 = new ArrayList<>(now);//n
        }

        // 倒着输出结果
        for (int i = now.size() - 1; i >= 0; i--) 
        {
            System.out.print(now.get(i));
        }
    }
}