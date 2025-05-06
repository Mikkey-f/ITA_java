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

## 数据类型

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
byte b2 = 1000；//这同样也会报错，因为byte的值规定的是-128——127
```

2025/4//23截至今日的学习

 4.  byte, short, char 他们三者可以计算，在计算时首先转换为 int 类型

 5.  ```java
	byte b2 = 1;
	short s1 = 1;
	short s2 = b2 + s1;//这样还是会报错的，因为b2 + s1 => 转换成了int类型
	byte b3 = 1;
	byte b4 = b2 + b3;//还是会报错，因为b2 + b3 =>转换成了int类型
	```

 6.  boolean类型不参与自动类型转换

 7.  自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型

	```java
	byte b4 = 1;
	short s3 = 100;
	int num200 = 1;
	double num300 = 1.1;
	// 表达式 b4 + s3 + num200 + num300 体现自动提升原则
	double num500 = b4 + s3 + num200 + num300;//直接变成double类型
	```

	

#### 强制类型转换

介绍：
自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符 ()，但可能造成精度降低或溢出，格外要注意。 

```java
int i = (int)1.9;
System.out.println(i);//这个造成精度的损失
int j = 100;
byte b1 = (byte)j;
System.out.println(b1);//这个造成了数据溢出
```

```java
//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
int x = (int)10*3.5+6*1.5;//编译错误： double -> int
int x = (int)(10*3.5+6*1.5); // ((int)44.0) -> 44
System.out.println(x);
```

char类型可以保存int的常量值，但不能保存int的变量值，需要强转

```java
char c1 = 100; //ok
int m = 100; //ok
char c2 = m; //错误，m是int的变量值
char c3 = (char)m; //ok
System.out.println(c3); //100对应的字符，"d"字符
```

byte和short，char 类型在进行运算时，当做int类型处理

基本数据转换练习

```java
// 判断是否能够通过编译
// 1. 
short s = 12; //ok
s = s - 9; //错误 int -> short

// 2.
byte b = 10; //ok
b = b + 11; //错误 int -> byte
b = (byte)(b + 11); //正确，使用强转

// 3.
char c = 'a'; //ok
int i = 16; //ok
float d = 3.14F; //ok
double result = c + i + d; //ok float -> double

// 4.
byte b1 = 16; //ok
short s1 = 14; //ok
short t = s + b; //错误 int -> short
```

#### String与基本类型转换

##### String转基本类型

```java
int n1 = 100;
float f1 = 1.1F;
double d1 = 4.5;
boolean b1 = true;
String s1 = n1 + "";
String s2 = f1 + "";
String s3 = d1 + "";
String s4 = b1 + "";
System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
```

##### 基本类型转String

```java
String s5 = "123";
//会在OOP 讲对象和方法的时候回详细
//解读 使用 基本数据类型对应的包装类，的相应方法，得到基本数据类型
int num1 = Integer.parseInt(s5);
double num2 = Double.parseDouble(s5);
float num3 = Float.parseFloat(s5);
Long num4 = Long.parseLong(s5);
byte num5 = Byte.parseByte(s5);
boolean b = Boolean.parseBoolean("true");
short num6 = Short.parseShort(s5);
System.out.println(s5.charAt(0));//得到的就是一个1
```

注意：怎么把字符串转成字符char ->含义是指把字符串的第一个字符得到

#### 章节作业

```java
String book1 = "天龙八部";
String book2 = "笑傲江湖";
System.out.println(book1 + book2); //天龙八部笑傲江湖，因为加号左右两边是字符串，做拼接

//性别应该使用char保存
char c1 = '男';
char c2 = '女';
System.out.println(c1 + c2); //得到 男 字符码值 + 女 字符码值，字符类型的本质是整数

/*用变量将姓名、年龄、成绩、性别、爱好存储
使用 +
添加适当的注释
添加转义字符，使用一条语句输出*/

String name = "jack";
int age = 20;
double score = 80.9;
char gender = '男';
String hobby = "打篮球";
//输出信息，可以使用换行
System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name 
                   + "\t" + age + "\t" + score + "\t" + gender + "\t" + hobby);
```

2025/4/24 line

## 运算符

1. 算术运算符
2. 赋值运算符
3. 关系运算符 [比较运算符]
4. 逻辑运算符
5. 位运算符 [需要二进制基础]
6. 三元运算符

| 运算符 | 运算                     | 范例        | 结果      |
| ------ | ------------------------ | ----------- | --------- |
| +      | 正号                     | +7          | 7         |
| -      | 负号                     | b=11; -b    | -11       |
| +      | 加                       | 9+9         | 18        |
| -      | 减                       | 10-8        | 2         |
| *      | 乘                       | 7*8         | 56        |
| /      | 除                       | 9/9         | 1         |
| %      | 取模 (取余)              | 11%9        | 2         |
| ++     | 自增（前）：先运算后取值 | a=2;b=++a;  | a=3;b=3   |
| ++     | 自增（后）：先取值后运算 | a=2;b=a++;  | a=3;b=2   |
| --     | 自减（前）：先运算后取值 | a=2;b=--a   | a=1;b=1   |
| --     | 自减（后）：先取值后运算 | a=2;b=a--   | a=1;b=2   |
| +      | 字符串相加               | "hsp"+"edu" | "hsp edu" |

```java
System.out.println("10 / 4");//数学角度是2，但是在java中是2，因为10和4都是整数类型，计算结果时自动变为整数
System.out.println("10.0 / 4");//这个时候输出就是2.5
double d = 10 / 4;。。这里则会是输出2.0，而不是2

// 取模 ，取余
// 在 % 的本质 看一个公式 a % b = a - a / b * b
// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
// -10 % -3 = (-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
System.out.println(10 % 3); //1
System.out.println(-10 % 3); // -1
System.out.println(10 % -3); //1
System.out.println(-10 % -3);//-1
```

#### 算术运算符

自增++
作为独立的语句使用：
前 ++ 和后 ++ 都完全等价于 i = i + 1;
作为表达式使用
前 ++：++i; 先自增后赋值
后 ++：i++; 先赋值后自增

```java
int i = 8;
int k = i++;//k = i, i = i +1;k = 8, i = 9
int j = ++i;//i = i +1,j = i;i = 9, j = 9
```

面试题

```java
// 面试题1
int i = 1; // i->1
i = i++; 
// 规则使用临时变量: (1) temp = i; (2) i = i + 1; (3) i = temp;  temp = 1；i = 2； i = 1；
System.out.println(i); 
// 问: 结果是多少? 为什么?关键点就是临时有一个储存容器是temp

// 面试题2
int i = 1;
i = ++i; 
// 规则使用临时变量: (1) i = i + 1;(2) temp = i; (3) i = temp;就是i = 2；temp = 2；
System.out.println(i); 
```

2025/4/26

练习

```java
public class Main{
    public static void main(String[] args){
        //加入还有59天放假。 问合多少星期和几天
        int days = 59;
        int weeks = days / 7;
        int leftdays = days % 7;
        System.out.println(days + "天 合" + weeks +"星期零" +leftdays +"天");
        //摄氏度与华氏温度的转换
       	double huaShi = 1234.6;
		double sheShi = 5 / 9 * (huaShi - 100);
		System.out.println ("华氏温度" + huaShi
		"对应的摄氏温度 =" + sheShi);
    }
}
```

#### 关系运算符

#### 逻辑运算符

1. a&b：& 叫逻辑与：规则：当 a 和 b 同时为 true，则结果为 true，否则为 false
2. a&&b：&& 叫短路与：规则：当 a 和 b 同时为 true，则结果为 true，否则为 false
3. a|b：| 叫逻辑或，规则：当 a 和 b，有一个为 true ，则结果为 true，否则为 false
4. a||b：|| 叫短路或，规则：当 a 和 b，有一个为 true，则结果为 true，否则为 false
5. !a：! 叫取反，或者非运算。当 a 为 true，则结果为 false，当 a 为 false 是，结果为 true
6. a^b：叫逻辑异或，当 a 和 b 不同时，则结果为 true，否则为 false

```java
int a = 4;
int b = 9;
// 对于 && 短路与而言，如果第一个条件为 false，后面的条件不再判断
// 对于 & 逻辑与而言，如果第一个条件为 false，后面的条件仍然会判断
if (a < 1 && ++b < 50) {
System.out.println ("a=" + a + "b=" + b);// 4 9
}
if (a < 1 & ++b < 50) {
System.out.println ("a=" + a + "b=" + b);// 4 10
}
```

```java
//(1)|| 短路或：如果第一个条件为 true,
// 则第二个条件不会判断，最终结果为 true，效率高
//(2)| 逻辑或：不管第一个条件是否为 true，第二个条件都要判断，效率低
```

```java
// 非运算操作是取反  T->F ，F -> T
System.out.println(60 > 20); //T
System.out.println(!(60 > 20)); //F

//^: 叫逻辑异或，当 a 和 b 不同时，则结果为true，否则为false
boolean b = (10 > 1) ^ (3 > 5);//真真变假假
System.out.println("b=" + b);//T
```

```java
int x = 5, y = 5;
if (x++ == 5 | ++y == 5) {
    x = 11;
}
System.out.println("x=" + x + ",y=" + y);//11 6

int x = 5, y = 5;
if (x++ == 5 || ++y == 5) {
    x = 11;
}
System.out.println("x=" + x + ",y=" + y);//11 5，后面的那个条件就没有运行了
```

4/27

#### 赋值运算符

- 赋值运算符特点

	1. 运算顺序从右往左 int num = a + b + c
	2. 赋值运算符的左边 只能是变量，右边 可以是变量、表达式、常量值
		int num = 20; int num2= 78 * 34 - 10; int num3 = a;
	3. 复合赋值运算符等价于下面的效果
		比如: a+=3; 等价于 a=a+3;
	4. 复合赋值运算符会进行类型转换。
		byte b = 2; b+=3; b++;

	

```java
//复合赋值运算符会进行类型转换
byte b = 3;
b += 2; // 等价 b = (byte)(b + 2);不能写b = b + 2
b++;//b = (byte)(b+1)
```

#### 三元运算符



1. 如果条件表达式为 true，运算后的结果是表达式 1；
2. 如果条件表达式为 false，运算后的结果是表达式 2；

```java
int a = 10;
int b = 99;
// 解读
// 1. a > b 为 false
// 2. 返回 b--, 先返回 b的值,然后在 b-1
// 3. 返回的结果是99
int result = a > b? a++ : b--;
System.out.println()
//细节注意    
int c = a > b? (int)1.1 : (int)3.4; //可以的
double d = a > b? a : b + 3; //可以的, 满足 int -> double

//思路
//1. 先得到 n1 和 n2 中最大数 ，保存到 max1
//2. 然后再 求出 max1 和 n3中的最大数, 保存到 max2
int max1 = n1 > n2? n1 : n2;
int max2 = max1 > n3? max1 : n3;
System.out.println("最大数=" + max2);
```

#### 标识符

- **标识符命名规范 [更加专业]**

1. **包名**：多单词组成时所有字母都小写：aaa.bbb.ccc// 比如 com.hsp.crm
2. **类名、接口名**：多单词组成时，所有单词的首字母大写：XxxYyyZzz [大驼峰] 比如：TankShotGame
3. **变量名、方法名**：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz [小驼峰，简称 驼峰法] 比如：tankShotGame
4. **常量名**：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ 比如：定义一个所得税率 TAX_RATE
5. 后面我们学习到 类，包，接口，等时，我们的命名规范要这样遵守，更加详细的看文档。

#### 键盘输入语句

- **介绍**
	在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。Input.java，需要一个扫描器 (对象)，就是 Scanner

- **步骤：**

1. 导入该类的所在包，java.util.*
2. 创建该类对象（声明变量）
3. 调用里面的功能

```java
import java.util.Scanner;//表示把java.util下的Scanner类导入
public class Input{
    public static void main(String[] args){
//1. 引入/导入Scanner类所在的包
//2. 创建 Scanner 对象 , new 创建一个对象,体会
//  myScanner 就是 Scanner类的对象
Scanner myScanner = new Scanner(System.in);
//3. 接收用户输入了, 使用 相关的方法
System.out.println("请输入名字");
//当程序执行到 next 方法时, 会等待用户输入,
String name = myScanner.next(); //接收用户输入字符串
System.out.println("请输入年龄");
int age = myScanner.nextInt(); //接收用户输入int
System.out.println("请输入薪水");
double sal = myScanner.nextDouble(); //接收用户输入double
System.out.println("人的信息如下:");
System.out.println("名字=" + name
        + " 年龄=" + age + " 薪水=" + sal);
    }
}
```

#### 进制

```java
public class BinaryTest {

    public static void main(String[] args) {
        //从开头来判别是用的哪种进制
        //n1 二进制
        int n1 = 0b1010;
        //n2 10进制
        int n2 = 1010;
        //n3 8进制
        int n3 = 01010;
        //n4 16进制，(0 - 9）对应(0 - 9) ，(A - F)对应(10 - 15)
        int n4 = 0X10101;
        System.out.println("");
    }
}
```

#### 位运算

```plaintext
~2=? // 按位取反
2&3=?//2按位与3
2|3=? 
~-5=?
13&7=?
5|4=?
-3^3=?//^ 按位异或
```

**源码，反码，补码**

1. 二进制的最高位是符号位：0 表示正数，1 表示负数（口诀：0->0 1-> -）
2. 正数的原码，反码，补码都一样（三码合一）
3. 负数的反码 = 它的原码符号位不变，其它位取反 (0->1,1->0)
4. 负数的补码 = 它的反码 + 1，负数的反码 = 负数的补码 - 1
5. 0 的反码，补码都是 0
6. java 没有无符号数，换言之，java 中的数都是有符号的
7. 在计算机运算的时候，都是以补码的方式来运算的.
8. 当我们看运算结果的时候，**要看他的原码**

位运算详解

- java 中有 7 个位运算 (&、|、^、~、>>、<< 和 >>>)
- 分别是 按位与 &、按位或 |、按位异或 ^, 按位取反～, 它们的运算规则是:
	- 按位与 & ： 两位全为 1，结果为 1，否则为 0
	- 按位或 | ： 两位有一个为 1，结果为 1，否则为 0
	- 按位异或 ^ ： 两位一个为 0, 一个为 1，结果为 1，否则为 0
	- 按位取反～： 0->1 ,1->0
		比如：
		2&3=?  
		~2 =? 
		~~2 =? 
		2|3=? 
		2^3=?

还有 3 个位运算符 >>、<<和>>>，运算规则:

1. 算术右移 >>: 低位溢出，符号位不变，并用符号位补溢出的高位
2. 算术左移 <<: 符号位不变，低位补 0
3. 逻辑右移也叫无符号右移，运算规则是：低位溢出，高位补 0
4. 特别说明：没有 <<< 符号

```java
int a=1>>2; //1 => 00000001 => 00000000 本质1 / 2 / 2 = 0
int c=1<<2; //1 => 00000001 => 00000100 本质1 * 2 * 2 = 4
```

补充

```java
//a % b当a是小数时, 公式 = a - (int)a / b * b
//-10.5%3 = -10.5 - (-10)/3 * 3 = -10.5 + 9 = -1.5
```

## 控制结构

#### 顺序控制

- **顺序控制介绍**
	程序从上到下逐行地执行，中间没有任何判断和跳转
- **顺序控制举例和注意事项**
	Java 中定义变量时采用合法的前向引用。如：

```java
public class Test{
    int num1 = 12;
    int num2 = num1 + 2;
}
```

错误形式：

```java
public class Test{
    int num2 = num1 + 2; //错误
    int num1 = 12;
}
```

#### 单分支双分支多分支

if-else

![image-20250506193303494](../../AppData/Roaming/Typora/typora-user-images/image-20250506193303494.png)

```java
if(grade >= 1 && grade <= 100) {
    //因为有4种情况，所以使用多分支
    if(grade == 100) {
        System.out.println("信用极好");
    } else if (grade > 80 && grade <= 99) { //信用分为(80，99]时
        System.out.println("信用优秀");
    } else if (grade >= 60 && grade <= 80) { //信用分为[60,80]时
        System.out.println("信用一般");
    } else { //其它情况
        System.out.println("信用不及格");
    }
} else {
    System.out.println("信用分需要在1-100,请重新输入:)");
}
```

```java
boolean b = true;
if(b = false) 
    System.out.println("a");
else if(b)
    System.out.println("b");
else if(b)
    System.out.println("c");
else
    System.out.println("d");
//最终输出的是c
```

#### 嵌套分支

```java
// 思路分析
//1. 创建 Scanner 对象，接收用户输入
//2. 接收 成绩保存到 double score
//3. 使用 if-else 判断 如果初赛成绩大于 8.0 进入决赛，否则提示淘汰
//4. 如果进入到 决赛，再接收 char gender，使用 if-else 输出信息

Scanner myScanner = new Scanner(System.in);
System.out.println("请输入该歌手的成绩");
double score = myScanner.nextDouble();
if( score > 8.0 ){
    System.out.println("请输入性别");
    char gender = myScanner.next().charAt(0);//怎么把字符串转成字符 char -> 含义是指 把字符串的第一个字符得到
// 解读 s5.charAt (0) 得到 s5 字符串的第一个字符 'I'
System.out.println (s5.charAt (0));
    if( gender == '男' ){
        System.out.println("进入男子组");
    } else if(gender == '女'){
        System.out.println("进入女子组");
    } else {
        System.out.println("你的性别有误，不能参加决赛~");
    }
} else {
    System.out.println("sorry，你被淘汰了~");
}
```

2025/5/6
