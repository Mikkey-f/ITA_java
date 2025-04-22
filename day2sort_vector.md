# 算法

2025/4/22

![image-20250422214609652](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250422214609652.png)

[P1177 【模板】排序 - 洛谷](https://www.luogu.com.cn/problem/P1177)

这题还是涉及排序的问题，但是此题相比较于昨天的直接先定义一个全局变量的解法就显得不加实际了，所以这里今天我们使用vector这个动态的数组容器，以防数组溢出的问题。

```c++
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> numbers(N);

    for (int i = 0; i < N; ++i) {
            cin >> numbers[i];
    }

    sort(numbers.begin(), numbers.end());

    for (int i = 0; i < N; ++i) {
        if (i > 0) {
            cout << " ";
        }
        cout << numbers[i];
    }
   cout << endl;

    return 0;
}
```

### 分析

1. 定义一个`vector<int>`类型的对象`numbers`，其初始大小为`N`，这意味着该向量能够存储`N`个整数

2. numbers.begin()`和`numbers.end()`分别代表向量的起始和结束迭代器，这表明排序范围是整个向量。默认情况下，`std::sort`会按升序对元素进行排序。

3. 利用`for`循环遍历排序后的`numbers`向量。

	若`i > 0`，则输出一个空格，以此保证数字之间用空格分隔。

### 小结

1. vector` 是一个动态数组容器，并非普通的数组。因此不能直接用数组的方式来使用 `sort函数
2. 对于自定义类型（例如迭代器或者重载了自增运算符的类对象），`++i` 往往比 `i++` 效率更高。这是因为 `i++` 需要创建一个临时对象来保存 `i` 原来的值，而 `++i` 直接返回自增后的对象，无需创建临时对象，故循环使用++i而非i++

