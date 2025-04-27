[P1255 数楼梯 - 洛谷](https://www.luogu.com.cn/problem/P1255)
动态规划+高精度加法
看数据类型，n可以到5000，用long都不够，只能过60%
用高精度加法，套模版写就行了，注意一些小细节，进位，倒着输出。
```cpp
#include<iostream>
#include<vector>
using namespace std;
vector<int> highadd(vector<int>&prev1,vector<int>& prev2)
{
	vector<int> res;
	int carry=0;//进位 
	int temp=0;//对应位相加的和 
	for(int i=0;i<prev1.size()||i<prev2.size();i++)
	{
		temp+=carry;
		if(i<prev1.size())
			temp+=prev1[i];
		if(i<prev2.size())
			temp+=prev2[i];
		res.push_back(temp%10);
		carry=temp/10;
		temp=0;//别忘了		
	}
	while(carry!=0)//处理最后的可能的进位
	{
		res.push_back(carry%10);
		carry/=10;
	}
	return res; 
}
int main()
{
	int n;
	cin>>n;
	if(n==1)
	{
		cout<<1;
		return 0;
	}
	if(n==2)
	{
		cout<<2;
		return 0;
	}
	vector<int> prev2(1,1);//走到前两个台阶的位置的方法数 
	vector<int> prev1(1,2);//走到前一个台阶的位置的方法数 
	vector<int>now;//走到当前台阶位置的方法数 
	for(int i=3;i<=n;i++)
	{
		now=highadd(prev1,prev2);
		prev2=prev1;
		prev1=now;
	}	
	for(int i=now.size()-1;i>=0;i--)//倒着
	{
		cout<<now[i];
	} 
	return 0;
}
```
网课笔记
![image](https://github.com/user-attachments/assets/9d861734-2af4-4251-9de1-d6d3420e30c1)
![image](https://github.com/user-attachments/assets/4b0bbccc-bad4-4303-abea-a8383804f887)



> [P1177 【模板】排序 - 洛谷](https://www.luogu.com.cn/problem/P1177)
前缀和的模版题，下标要从一开始
 ```cpp
 #include <iostream>
#include <vector>

int main() 
{
    int n;
    std::cin >> n;
    std::vector<int> a(n + 1);
    // 前缀和
    std::vector<int> prefixSum(n + 1, 0);
    // 计算前缀和
    for (int i = 1; i <= n; ++i) 
    {
        std::cin >> a[i];
        prefixSum[i] = prefixSum[i - 1] + a[i];
    }

    int m;
    std::cin >> m;

    // m 个区间
    for (int i = 0; i < m; ++i)
    {
        int l, r;
        std::cin >> l >> r;
        // 计算区间和
        int sum = prefixSum[r] - prefixSum[l - 1];
        std::cout << sum << std::endl;
    }
    return 0;
}
```
笔记


[P1314 [NOIP 2011 提高组] 聪明的质监员 - 洛谷](https://www.luogu.com.cn/problem/P1314)
题目里说通过调整参数W的值让检验结果靠近S，我们可以用二分法来缩小W的区间，让W是mid，然后让W对应的y接近s，而y是各个区间重量大于等于W的矿产的数量乘以这些的矿产的价值之和相加，但是区间的数量最多有2e5，为了避免重复计算，用前缀和，cnt记录在从第一个到某一个矿产里面重量大于等于W的矿产个数，sum记录这些矿产的价值和。
```
#include <iostream>
#include <algorithm>
using namespace std;
typedef long long ll;
const int N = 200010;
int n, m;
ll S;
int w[N], v[N];
int l[N], r[N];
int cnt[N];
ll sum[N];//这里
ll solution(int W)
{
    for(int i=1;i<=n;i++)
    {
        if(w[i]>=W)//W越小，Y越大，因为大于W的个数会更多，价值总和也更多
        {
            sum[i]=sum[i-1]+v[i];
            cnt[i]=cnt[i-1]+1;
        }
        else
        {
            sum[i]=sum[i-1];
            cnt[i]=cnt[i-1];
        }
    }
    ll res=0;
    for(int i=0;i<m;i++)
        res+=(cnt[r[i]]-cnt[l[i]-1])*(sum[r[i]]-sum[l[i]-1]);//个数之和乘以价值之和
    return res;
}
int main()
{
    cin>>n>>m>>S;
    for(int i=1;i<=n;i++)//要计算前缀和，从1开始
        cin>>w[i]>>v[i];
    for(int i=0;i<m;i++)
        cin>>l[i]>>r[i];
    int left=1,right=1e6+1;//左闭右开
    //while循环，找到让s-y的绝对值最小的mid
    while (left < right) //这里不能取等，因为是左闭右开
    {
        int mid = left + right >> 1;
        if (solution(mid) > S) 
            left = mid+1;
        else 
            right = mid;
    }//退出循环的时候left等于right，要么是mid要么是mid+1
    cout << min(abs(solution(left) - S), abs(S - solution(left-1))) << endl;//这里
  // 请在此输入您的代码
    return 0;
}
```
笔记
![image](https://github.com/user-attachments/assets/a52b5156-b936-489d-8a2d-248f051c28a9)

[P1177 【模板】排序 - 洛谷](https://www.luogu.com.cn/problem/P1177)
每次输入一个数就把他放在指定位置，通过二分进行查找，二分的时间复杂度是logm，总的时间复杂度的最坏情况下是n方，但是还是能过
这里要注意lower_bound的使用
```cpp
#include<bits/stdc++.h>
using namespace std;
int n;
vector<int> a;
int main()
{
    cin>>n;
    for(int i=0;i<n;i++)
	{
        int x;
        cin>>x;
        // lower_bound 函数在a 中查找第一个不小于 x 的元素的位置
        auto it = lower_bound(a.begin(),a.end(),x);
        a.emplace(it,x);
    }
    for(int i=0;i<n;i++)
        cout<<a[i]<<' ';
    return 0;
}

```
笔记![Uploading image.png…]()

![image](https://github.com/user-attachments/assets/30dd4fc7-1f1f-4c0e-a413-0eef84ed981d)



