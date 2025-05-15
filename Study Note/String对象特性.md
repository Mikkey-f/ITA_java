# String对象特性

## 一.

### 1.

![image-20250512201716160](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512201716160.png)

![image-20250512202005913](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512202005913.png)



### 2.

![image-20250512203243235](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512203243235.png)

![image-20250512204213241](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512204213241.png)



### 3.

![image-20250512210755121](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512210755121.png)

![image-20250512210053316](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250512210053316.png)

属性ch用final修饰，为什么还能改ch的值呢？ 因为final是指不能改ch指向的地址，ch中的值可以改

ch是**引用类型**，主方法中将ex.ch传入change方法，形参ch与实参ch指向内存的同一个位置，对形参ch的修改就是对实参ch的修改