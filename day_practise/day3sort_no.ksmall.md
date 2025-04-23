# 算法

2025/4/23

![image-20250423214248221](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250423214248221.png)

[P1923 【深基9.例4】求第 k 小的数 - 洛谷](https://www.luogu.com.cn/problem/P1923)

今天这道题，还是使用快排，相比较于昨天，今天的数组量不是很大，直接全局定义变量，然后用一个静态数组来储存数字，然后呢使用sort函数排序，再输出第k小的数字就行了

#### 下面是c++代码

```cpp
#include <iostream>
#include <algorithm>

using namespace std;
int x[5000005], k;
int main()
{
	int n;
	cin >> n >> k;
	for (int i = 0; i < n; ++i)
		cin >> x[i];
	sort(x, x + n);//快排
	cout << x[k];
}
```

#### 以下是通过AI转译的Java语言

```java
import java.util.Arrays;//入 Arrays 类，该类提供了一系列操作数组的静态方法，如排序、查找等。
import java.util.Scanner;//入 Scanner 类，用于从标准输入读取用户输入。
//鄙人认为这类似于c++的printf或cin

public class Main {//入口点位于一个公共类中
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         //创建一个 Scanner 对象，用于从标准输入读取数据。
        int n = scanner.nextInt();
        int k = scanner.nextInt();
         //读取两个整数赋值给n，k
        int[] x = new int[n];
         //创建一个长度为n的数组x
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }//读取整数，存入数组x当中
        Arrays.sort(x);
         //使用 Arrays 类的 sort 方法对数组 x 进行升序排序。
        System.out.println(x[k]);
         //输出排序后数组 x 中索引为 k 的元素。
        scanner.close();
         //关闭 Scanner 对象，释放资源。
    }
}
```

#### 