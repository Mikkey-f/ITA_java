# 算法

2025/4/21

![image-20250421221554957](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250421221554957.png)

[P1271 【深基9.例1】选举学生会 - 洛谷](https://www.luogu.com.cn/problem/P1271)
此题主要是涉及快速排序

```cpp
#include<iostream>
#include<algorithm>

using namespace std;
int a[2000000],n,m;
int main()
{
	cin>>n>>m;
	for(int i=0;i<m;i++)cin>>a[i];
	sort(a,a+m); //sort排序
	for(int i=0;i<m;i++)cout<<a[i]<<" ";
	return 0;
}
```

### 全局变量定义：

- 定义了一个大小为 2000000 的整数数组 `a`，用于存储输入的整数。
- 定义了两个整数变量 `n` 和 `m`，`n` 在代码中未被使用，`m` 用于表示要输入的整数的数量。
	

### 主函数：

- `cin>>n>>m;`：从标准输入读取两个整数，分别赋值给 `n` 和 `m`。
- `for(int i=0;i<m;i++)cin>>a[i];`：通过循环读取 `m` 个整数，并将它们存储到数组 `a` 中。
- `sort(a,a+m);`：使用 `std::sort` 函数对数组 `a` 中的前 `m` 个元素进行升序排序。`std::sort` 是 C++ 标准库中的排序函数，其时间复杂度为 *O*(*n**l**o**g**n*)。
- `for(int i=0;i<m;i++)cout<<a[i]<<" ";`：通过循环将排序后的数组元素依次输出，元素之间用空格分隔。
- `return 0;`：表示程序正常结束。