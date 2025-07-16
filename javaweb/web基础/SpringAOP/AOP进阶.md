# AOP进阶

## 一.通知类型

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714145211039.png" alt="image-20250714145211039" style="zoom: 50%;" />



@PointCut：抽取公共的切点表达式，提高代码的复用性

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714152020597.png" alt="image-20250714152020597" style="zoom:50%;" />



## 二.通知顺序

![image-20250714153143436](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714153143436.png)



## 三.切入点表达式

### 1. execution

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714171015621.png" alt="image-20250714171015621" style="zoom:50%;" />

```java
@Slf4j
@Component
@Order(3)
@Aspect
public class MyAspect5 {
    //前置通知
    //@Before("execution(public void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Before("execution(void delete(java.lang.Integer))")
    //@Before("execution(public void com.itheima.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Before("execution(* com.*.service.impl.*.delete(java.lang.Integer))")
    //@Before("execution(* com.*.service.impl.*.*(java.lang.Integer))")
    //@Before("execution(* com.*.service.impl.*.*(*))")
    //@Before("execution(* com.*.service.impl.*.del*(*))")
    //@Before("execution(* com..service.impl..delete(..))")

    //匹配list与delete方法
    @Before("execution(* com.itheima.service.impl.DeptServiceImpl.list(..)) ||" +
            "execution(* com.itheima.service.impl.DeptServiceImpl.delete(..))") //匹配两个方法
    public void before(){
        log.info("MyAspect4 -> before ...");
    }

}
```



<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714171309889.png" alt="image-20250714171309889" style="zoom: 50%;" />



### 2. @annotation

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714172418071.png" alt="image-20250714172418071" style="zoom:50%;" />



## 四.连接点

<img src="C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714193147252.png" alt="image-20250714193147252" style="zoom:50%;" />

```java
@Slf4j
@Component
@Order(3)
@Aspect
public class MyAspect6 {
    //前置通知
    @Before("execution(* com.itheima.service.impl.*.*(..))")
    public void before(JoinPoint joinPoint){
        log.info("MyAspect4 -> before ...");
        //1.获取目标对象
        Object target = joinPoint.getTarget();

        //2.获取目标类
        String name = target.getClass().getName();

        //3.获取目标方法
        String methodName = joinPoint.getSignature().getName();

        //4.获取目标方法参数
        Object[] args = joinPoint.getArgs();

    }
}
```

