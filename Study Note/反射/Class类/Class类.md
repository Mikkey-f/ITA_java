# Class类

## 一.基本介绍

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603193714469.png" alt="image-20250603193714469" style="zoom:67%;" />



1.

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603193947710.png" alt="image-20250603193947710" style="zoom:67%;" />

2~3：

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603195327233.png" alt="image-20250603195327233" style="zoom:67%;" />

类加载一次后，就有了该类的所以信息，相当于一个模板，所以只会加载一次





## 二.常用方法

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603200415690.png" alt="image-20250603200415690" style="zoom:67%;" />

```java
        String classAllPath = "com.szj.Car";
        //1. 获取Car类对应的Class对象
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2. 输出cls
        System.out.println(cls);//显示cls对象是哪个类的Class对象 com.szj.Car
        System.out.println(cls.getClass());//输出运行类型 java.lang.Class
        //3. 得到包名
        System.out.println(cls.getPackage().getName());
        //4. 得到全类名
        System.out.println(cls.getName());
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        //6.通过反射获取属性，该属性不能是私有的
        Field brand = cls.getField("brand");
        System.out.println(brand);//宝马
        //7.通过反射给属性赋值
        brand.set(car,"奔驰");
        //8.希望可以得到所有的属性
        Field[] fields = cls.getFields();
        for (Field f : fields){
            System.out.println(f.getName());
        }
```





## 三.哪些类型有Class对象

![image-20250603210653277](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603210653277.png)

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250603210814780.png" alt="image-20250603210814780" style="zoom:67%;" />