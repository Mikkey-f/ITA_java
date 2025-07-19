# 加载properties文件



![image-20250718162714097](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250718162714097.png)



不使用系统环境配置：

```java
<context:property-placeholder location="jdbc.properties" system-properties-mode="NEVER"/>
```



使用多个properties文件：

```java
<context:property-placeholder location="jdbc.properties,jdbc2.properties" system-properties-mode="NEVER"/> 或
<context:property-placeholder location="classpath:*.properties" system-properties-mode="NEVER"/> （必须用这种）
```

![image-20250718163521398](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250718163521398.png)