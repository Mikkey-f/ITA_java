# 算法

![image-20250424221045742](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250424221045742.png)

[P1059 [NOIP 2006 普及组\] 明明的随机数 - 洛谷](https://www.luogu.com.cn/problem/P1059)

这道题就是使用两个函数，一个快排函数sort 一个去重函数unique



```cpp
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> nums(n);
    
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }
    // 使用sort函数对数组进行排序
    sort(nums.begin(), nums.end());
    // 使用unique函数进行去重，unique函数会把重复元素放到数组末尾，并返回去重后最后一个不重复元素的下一个位置的迭代器
    auto it = unique(nums.begin(), nums.end());
    // 计算不重复元素的个数
    int m = it - nums.begin();
    // 输出不重复元素的个数
    cout << m << endl;
    // 输出去重并排序后的不重复元素
    for (int i = 0; i < m; ++i) {
        cout << nums[i] << " ";
    }
    return 0;
}
```

`unique函数`

`unique` 函数返回的是一个迭代器，这个迭代器指向去重后最后一个不重复元素的下一个位置。在代码里，我们使用 `auto` 关键字来自动推导这个迭代器的类型，并且把它赋值给变量 `it`。

`auto`

在 C++ 中，`auto` 关键字可以在声明变量时，让编译器依据初始化表达式自动推导变量的类型。这样做能使代码更加简洁，特别是在处理复杂类型时，优势尤为明显。

`nique` 函数返回的是一个迭代器，不过这个迭代器的具体类型较为复杂，所以使用 `auto` 关键字，编译器就能自动推导 `it` 的类型，而无需手动指定。

简化代码：若不使用 `auto` 关键字，就需要手动指定迭代器的类型，代码会变得冗长，如下所示：

```cpp
std::vector<int>::iterator it = unique(nums.begin(), nums.end());
```

**提高代码的可维护性**：当容器类型发生变化时，使用 `auto` 关键字就无需修改变量的类型声明，例如将 `vector<int>` 换成 `list<int>`，代码依然能正常编译运行。

### 注意事项

- `auto` 关键字必须在声明变量时进行初始化，因为编译器需要依据初始化表达式来推导变量的类型。
- `auto` 关键字仅用于变量的类型推导，不能用于函数返回值类型的推导（C++14 及以后版本支持 `auto` 用于函数返回值类型推导，但有一定的限制）。
