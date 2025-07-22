

# Spring事务



## 一. 案例

![image-20250721143148802](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721143148802.png)

![image-20250721144104972](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721144104972.png)

 ![image-20250721144501540](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721144501540.png)

![image-20250721144538830](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721144538830.png)

![image-20250721144631369](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721144631369.png)





## 二. 事务角色

![image-20250721145656340](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721145656340.png)

此时三个独立的事务，在成功执行完事务T1后，才出现异常的话，T2不会执行，T1不会回滚，就不同步了



spring事务T1和T2加入T，变为一个事务后，同成功同失败

![image-20250721145519148](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721145519148.png)

![image-20250721150312739](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721150312739.png)





## 三. 事务属性

![image-20250721150737523](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721150737523.png)





## 二. 事务传播行为

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721152122701.png" alt="image-20250721152122701" style="zoom:50%;" />

![image-20250721152043109](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721152043109.png)

因为追加日志业务是无论转账是否成功都要保留日志，所以日志不加入事务T，而是单独开启一个事务T2



![image-20250721152305106](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721152305106.png)

![image-20250721152803219](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250721152803219.png)