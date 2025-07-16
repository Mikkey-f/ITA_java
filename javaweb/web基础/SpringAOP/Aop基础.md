# AOP基础



## 一.Aop快速入门

![image-20250714130932018](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714130932018.png)

![image-20250714131254110](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714131254110.png)

![image-20250714132001935](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714132001935.png)

 ![image-20250714135253100](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714135253100.png)

```java
@Slf4j
@Aspect // 表示当前类是一个AOP类
@Component
public class RecordTimeAspect {

    @Around("execution(* com.itheima.service.impl.*.*(..))")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
        //记录方法运行的开始时间
        long begin = System.currentTimeMillis();

        //执行原始的方法
        Object result = pjp.proceed();

        //记录方法运行的结束时间，计算耗时
        long end = System.currentTimeMillis();
        log.info("方法 {} 执行耗时：{}ms", pjp.getSignature() , end - begin);
        return result;
    }
}
```





## 二.AOP核心概念

## ![image-20250714140049187](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714140049187.png)

![image-20250714142157300](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250714142157300.png)

