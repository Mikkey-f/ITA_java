# 算法

![image-20250506210736625](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250506210736625.png)

![image-20250506210758661](C:\Users\XinSt\AppData\Roaming\Typora\typora-user-images\image-20250506210758661.png)

这是一道结构体训练题，关键函数还是用快排

- ```
	struct node
	```

	：定义一个结构体

	```
	node
	```

	，用于存储每个学生的信息，包含以下成员：

	- `chines`：语文成绩。
	- `math`：数学成绩。
	- `eng`：英语成绩。
	- `sum`：总分。
	- `num`：学号。

- ### 比较函数`cmp`

	

	```cpp
	bool cmp(node x, node y) {
	    if (x.sum == y.sum) { //如果两者总分相同，进一步比较语文成绩 
	        if (x.chines == y.chines) { //如果语文成绩相同，进一步比较学号 
	            return x.num < y.num;
	        }
	        else {
	            return x.chines > y.chines; //如果语文成绩不同，成绩高的排在前面 
	        }
	    }
	    else {
	        return x.sum > y.sum; //如果两者总分不同，总分高的排在前面 
	    }
	}
	```

	- `cmp`函数是一个自定义的比较函数，用于`sort`函数的排序规则。
	- 排序规则如下
		- 首先比较总分`sum`，总分高的学生排在前面。
		- 如果总分相同，则比较语文成绩`chines`，语文成绩高的学生排在前面。
		- 如果语文成绩也相同，则比较学号`num`，学号小的学生排在前面。

	

- 排序部分

	- `sort(stu + 1, stu + n + 1, cmp);`：使用`sort`函数对学生信息数组`stu`进行排序，排序范围是从`stu[1]`到`stu[n]`，排序规则由`cmp`函数定义。