c++：（不完全对，看了题解用的是二维数组（明天深刻考虑一下））
#include<iostream>
using namespace std;
int main(){
long long n;
cin>>n;
if(n<=2)
{
cout<<n<<endl;
}
if(n>=3)
{
int a=1,b=2;\\斐波那契数列 f[n]=f[n-1]+f[n-2]
for(int i=3;i<=n;i++){
long long c=b;
b=a+b;\\b为当前状态，a为前一个状态
a=c;
}
cout<<b<<endl;

}
return 0;
}
二维数组（n》=3）：
a[1]=1;b[1]=2;
for(int i=3;i<=n;i++)
    {
        for(int j=1;j<=x;j++)
            {
                c[j]=a[j]+b[j];
                for(int j=1;j<=x;j++)\\遍历c数组
                    {
                        if(c[j]>9)\\满10进1
                        {
                            c[j+1]=c[j+1]+c[j]/10;
                            c[j]%=10;\\保留个位
                            if(j+1>x)
                                x++;
                            
                        }
                    }
                for(int j=1;j<=x;j++)
                    {
                        a[j]=b[j];\\将b赋值给a，准备下一轮递推
              
                        for(int j=1;j<=x;j++)
                            b[j]=c[j];\\将c赋值给b，完成递推
                    }
            }
        for(int i=x;i>0;i--)
            cout<<b[i];
    }

java：
import java.util.Scanner;

public class FibonacciConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        long n = scanner.nextLong();
        scanner.close();

        if (n <= 2) {
            System.out.println(n);
        } else {
            long a = 1;
            long b = 2;
            for (int i = 3; i <= n; i++) {
                long c = b;
                b = a + b;
                a = c;
            }
            System.out.println(b);
        }
    }
} 
二维数组：
import java.util.Scanner;

public class FibonacciHighPrecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int x = 1;
        // 假设数组大小足够大以处理结果
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];
        a[1] = 1;
        b[1] = 2;

        if (n <= 2) {
            System.out.println(n);
        } else {
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= x; j++) {
                    c[j] = a[j] + b[j];
                }
                for (int j = 1; j <= x; j++) {
                    if (c[j] > 9) {
                        c[j + 1] = c[j + 1] + c[j] / 10;
                        c[j] %= 10;
                        if (j + 1 > x) {
                            x++;
                        }
                    }
                }
                for (int j = 1; j <= x; j++) {
                    a[j] = b[j];
                }
                for (int j = 1; j <= x; j++) {
                    b[j] = c[j];
                }
            }
            for (int i = x; i > 0; i--) {
                System.out.print(b[i]);
            }
            System.out.println();
        }
        scanner.close();
    }
}    
