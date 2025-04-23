# JAVA学习

## JAVA前期准备

### java就业方向

​	Javaee软件工程师：电商，团购，众筹，sns（社交网络），教育，金融，搜索

​	大数据软件工程师：应用，算法，分析与挖掘

​	Android软件工程师

###   java的开发场景

1.SSM
2.android核心代码
3.大数据hadoop

### Java重要特点

1. Java语言是面向对象的(oop)
2. Java语言是健壮的。Java的强类型机制、异常处理、垃圾的自动收集等是Java程序健壮性的重要保证
3. Java语言是跨平台性的。[即:一个编译好的.class文件可以在多个系统下运行，这种特性称为跨平台] 
4. Java语言是解释型的[了解] 解释性语言：javascript,PHP,java  编译性语言: c / c++ 区别是：解释性语言，编译后的代码，不能直接被机器执行,需要解释器来执行，编译性语言，编译后的代码，可以直接被机器执行, c / c++ 

### java运行机制

![image-20250422170842156](../../AppData/Roaming/Typora/typora-user-images/image-20250422170842156.png)

![image-20250422170903914](../../AppData/Roaming/Typora/typora-user-images/image-20250422170903914.png)

### 什么是JDK

![image-20250422171002431](../../AppData/Roaming/Typora/typora-user-images/image-20250422171002431.png)

![image-20250422171308151](../../AppData/Roaming/Typora/typora-user-images/image-20250422171308151.png)

## JAVA快速入门

```java
//这是java的快速入门，演示java的开发步骤
//对代码的相关说明
//1. public class Hello 表示Hello是一个类，是一个public公有的类
//2. Hello{ } 表示一个类的开始和结束
//3. public static void main(String[] args) 表示一个主方法，即我们程序的入口
//4. main() 表示方法的开始和结束
//5. System.out.println("hello,world~"); 表示输出"hello,world~"到屏幕 
public class hello{
    
    public static void main(String[] args){
        System.out.println("hello,world")
    }
}

```

![image-20250423101923532](../../AppData/Roaming/Typora/typora-user-images/image-20250423101923532.png)

![image-20250423102147302](../../AppData/Roaming/Typora/typora-user-images/image-20250423102147302.png)

![image-20250423102528702](../../AppData/Roaming/Typora/typora-user-images/image-20250423102528702.png)

一个源文件中最多只能有一个public类。其它类的个数不限。

如果源文件包含一个public类，则文件名必须按该类名命名

 一个源文件中最多只能有一个public类。其它类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法 

###  学习方法

1. **需求**    - 

	1.工作需要    - 2.跳槽，对方要求    - 3.技术控 

2. 看看能否使用传统技术解决    - 1.能解决，但是不完美    - 2.解决不了 

3. 引出我们学习的新技术和知识点 

4. 学习新技术或者知识点的基本原理和基本语法(不要考虑细节) 

5. 快速入门(基本程序，crud) 

6. 开始研究技术的注意事项，使用细节，使用规范，如何优化=>没有止境，技术魅力    - 1.    - 2.    - 3.    - 4.    - 5.    - 6.    - 7.    - 9.，… （所能看到的细节）

###  转义字符

```java
// \t :一个制表位, 实现对齐的功能
System.out.println("北京\t天津\t上海");
// \n : 换行符
System.out.println("jack\nsmith\nmary");
// 一个\，第一个\表示转义字符，第二个才是表示你要转义的，
//如果想要输\\，则需要\\\\，注意第1和3的\\与第2和4的\\
System.out.println("C:\\Windows\\System32\\cmd.exe");
// \" :一个"
System.out.println("老韩说:\"要好好学习java,有前途\"");
// \' :一个'
System.out.println("老韩说:\'要好好学习java,有前途\'");

/* \r :一个回车 System.out.println("韩顺平教育\r北京");
解读
1，输出  韩顺平教育
2，\r表示回车
最终输出的是北京平教育*/
System.out.println("韩顺平教育\r\n北京"); 
/*输出结果是:
	韩顺平教育
	北京*/
```

### 易犯错误

1.找不到文件
	解决方法：源文件名不存在或者写错，或者当前路径错误

2.主类名和文件名不一致
	解决方法：声明为public的主类与文件名一致，否则编译失败

### 注释

![image-20250423113127860](../../AppData/Roaming/Typora/typora-user-images/image-20250423113127860.png)

文档注释

```java
/*
* @author
* @version
*
*/
```

更多的其他的标签自行上网查找[java 文档注释 -- javadoc 标签 - 快乐随行 - 博客园](https://www.cnblogs.com/jddreams/p/14503641.html)

### 变量

#### 变量原理

```java
class Test{
public static void main(String[] args){
	int a = 1;//这里就是一个地址指向了一个内存空间里面放有1的内存
	int b = 3;//一个地址指向了一个内存空间里面放有3的内存
	b = 89;//把内存空间里面的3变成89
	System.out.println(a);
	System.out.println(b);
}
```

#### 变量使用注意事项

1. 变量表示内存中的一个存储区域 （不同的变量，类型不同，占用的空间大小不同，比如：int 4个字节，double 就是8个字节）

2. 该区域有自己的名称[变量名]和类型[数据类型] 

3. 变量必须先声明，后使用，即有顺序

4. 该区域的数据/值可以在同一类型范围内不断变化 

5. 变量在同一个作用域内不能重名

	```java
	//一个错误示例
	class Test{
	public static void main(String[] args){
	int a = 1;
	int a = 3;//这就是错位的
	a = 5;//这样就是可以的
	}
	//如果我在这里重新定义一个作用域类，再来int a这样就是可以的
	class Test{
	public static void main(String[] args){
	int a = 666;
	}
	```

6. 变量=变量名+值+数据类型，这一点请大家注意。变量三要素 

#### 加号使用

1. 当左右两边都是数值型时，则做加法运算
2. 当左右两边有一方为字符串，则做拼接运算

```java
System.out.println (100 + 98); //198
System.out.println ("100" + 98);//10098
System.out.println (100 + 3 + "hello");//103hello
System.out.println ("hello" + 100 +3); //hello1003
```

### 数据类型

#### 基本数据类型

- 数值型
	- **整数类型**，存放整数 (byte [1],short [2],int [4],long [8])
	- **浮点 (小数) 类型**(float[4],double[8])
- **字符型**(char [2])，存放单个字符 ‘a’
- **布尔型**(boolean [1])，存放 true ,false

- 引用数据类型
	- **类**(class)
	- **接口**(interface)
	- **数组**([])

![image-20250423170113784](../../AppData/Roaming/Typora/typora-user-images/image-20250423170113784.png)

![image-20250423184311278](../../AppData/Roaming/Typora/typora-user-images/image-20250423184311278.png)

​	浮点数说明

1. 关于浮点数在机器中存放形式的简单说明，浮点数 = 符号位 + 指数位 + 尾数位

2. 尾数部分可能丢失，造成精度损失 (小数都是近似值)。

3. Java 的浮点型常量 (具体值) 默认为 double 型，声明 float 型常量，须后加‘f’或‘F’

	```java
	//float num1 = 1.1; // 对不对？错误。1.1是默认的八个字节，而float是4字节
	float num2 = 1.1F; // 对的
	double num3 = 1.1f//这也是对滴，把小的放大的里面没有问题
	```

​	

科学计数法

```java
5.12e2=512
5.12E-2=0.0512
```



```java
double num11 = 2.7;
double num12 = 8.1 / 3; //2.7，实际上是2。69999999997，小数计算时其实也是以精度的形式进行计算
System.out.println(num11);//2.7
System.out.println(num12);//接近2.7的一个小数，而不是2.7
/*得到一个重要的使用点：当我们对运算结果是小数的进行相等判断是，要小心，正确做法应该是，以两个数的差值的绝对值，在某个精度范围内判断*/
if( num11 == num12) {
    System.out.println("相等");
}//很明显，不会出现相等这句话，下面是正确的写法
if(Math.abs(num11 - num12) < 0.0000000001){\
    System.out.println("相等");
}

```

#### 字符类型

使用细节：

1. 字符常量是用单引号 (' ') 括起来的单个字符。例如：char c1 = 'a'; char c2 = ' 中 '; char c3 = '9';
2. Java 中还允许使用转义字符‘\’来将其后的字符转变为特殊字符型常量。例如：char c3 = '\n'; //'\n' 表示换行符
3. 在 java 中，char 的本质是一个整数，在输出时，是 unicode 码对应的字符。http://tool.chinaz.com/Tools/Unicode.aspx
4. 可以直接给 char 赋一个整数，然后输出时，会按照对应的 unicode 码字符输出 [97]
5. char 类型是可以进行运算的，相当于一个整数，因为它都对应有 Unicode 码。

#### 字符类型本质探讨

1. 字符型 存储到 计算机中，需要将字符对应的码值（整数）找出来，比如‘a’
	- 存储：‘a’ ===> 码值 97 ===> 二进制 ===> 存储
	- 读取：二进制 ==> 97 ==== ‘a’ ==> 显示
2. 字符和码值的对应关系是通过字符编码表决定的 (是规定好)

#### 介绍一下字符编码表

- **ASCII**：ASCII 编码表，一个字节表示，一共 128 个字符
- **Unicode**：Unicode 编码表，固定大小的编码，使用两个字节来表示字符，字母和汉字统一都是占用两个字节，这种浪费空间
- **utf-8**：编码表，大小可变的编码，字母使用 1 个字节，汉字使用 3 个字节
- **gbk**：可以表示汉字，而且范围广，字母使用 1 个字节，汉字 2 个字节
- **gb2312**：可以表示汉字，gb2312 < gbk

#### 布尔类型: boolean

- **基本介绍**

1. 布尔类型也叫 boolean 类型，boolean 类型数据只允许取值 true 和 false，无 null
2. boolean 类型占 1 个字节。
3. boolean 类型适于逻辑运算，一般用于程序流程控制 [这个后面会详细介绍]：
	- √ if 条件控制语句；
	- √ while 循环控制语句；
	- √ do-while 循环控制语句；
	- √ for 循环控制语句

```java
public class Boolean01{
    public static void main(String[] args){
	boolean isPass = true;
    if (isPass == false) {
        System.out.println("通过考试");
    } else {
        System.out.println("没有通过考试~");
}
}
}
//注意：不可以0或非0的整数替代false和true，这点和c语言不同
```

#### 自动类型转换

当 Java 程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型，这个就是自动类型转换。

数据类型按精度 (容量) 大小排序为 (背，规则)
char → int → long → float → double
byte → short → int → long → float → double

```java
int a = 'c';//输出结果97
double = 80;//输出结果80.0
//以上都是正确的类型转换
```

1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算。
2. 当我们把精度 (容量) 大的数据类型赋值给精度 (容量) 小的数据类型时，就会报错，反之就会进行自动类型转换。
3. (byte，short) 和 char 类型不会相互自动转换。

  

```java
byte b1 = 10;
char c1 = b1;
//这是错误，因为char和byte之间没有自动类型转换
```

2025/4//23截至今日的学习
