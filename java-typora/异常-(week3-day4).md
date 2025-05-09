# 异常-(week3-day4)

分类:**Error          Exception**

Exception可以分为RuntimeException及其子类和其他异常。

## Error和Exception的区别（***）

Error: 代表系统级别的错误（属于严重问题）

Exxeption:叫做异常,代表程序可能出现的问题。通常用Exception及它的子类封装程序可能出现的问题

运行时的异常:RuntimeException及其子类，编译阶段不会出现异常提醒。运行时出现的异常(如数组索引越界异常)

编译时异常：编译阶段就出现的异常（如日期解析异常）

```
,//编译时异常:
        int []arr={1,2,3,4,5};数组越界异常
        System.out.println(arr[10]);//
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at day4Erro,rAndException.testdemo1.main(testdemo1.java:10)
```

```
/*编译时异常(java文件->字节码文件时）:不运行代码，只检查语法是否错误，或者做性能优化
运行时异常(字节码文件->运行结果时）:程序出错而导致程序出现问题
 */

/*异常的作用:1.是用来查询bug的关键参考信息。
2.可以作为方法内部的特殊返回值，了解底层执行情况。
 */`
```

```
//2.->
       /*Student ss=new Student();
        ss.setAge(30);
        System.out.println(ss);出现异常*/
Exception in thread "main" java.lang.RuntimeException
	at day4ErrorAndException.Student.setAge(Student.java:28)
	at day4ErrorAndException.testdemo1.main(testdemo1.java:31)

```

## 细节

1. 如果try中没有遇到问题,会把try中所有的代码都执行,
          不会执行catch中的代码。只有遇到异常，才执行catch中的代码

    2. 如果try中遇到多个问题,要写多个catch与之对应.
       
       如果我们要捕获多个异常,它们存在父子关系,那么父类一定要写在下面。
       
   3. 如果try中的问题没有被捕获,将交给虚拟机处理,出现问题之后的代码全部不执行

   4. 如果try中遇到问题,try下面的代码不执行,直接执行catch中的代码。

```
//例1:
        int []arr={1,2,3,4,5};

        try{
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了"); 不执行
        }
        System.out.println("全部执行完成");   执行 
 例2:
        try{
            System.out.println(arr[10]);
            System.out.println(arr[2]/0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("程序出错了");
        }
        System.out.println("全部执行完成"); //所有语句均执行
        
 例3:
            try {
            System.out.println(arr[10]);//之后的都不运行
        }catch (ArithmeticException e){
            System.out.println("索引越界了");
        }
        System.out.println("程序全部执行完了");
         

 例4.
             try {
                System.out.println(arr[10]);
                System.out.println("是否执行了");//不会执行这句话
             }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("索引越界了");
             }
        System.out.println("全部执行完了");
         
```

