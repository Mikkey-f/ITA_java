# List接口和方法

## 一.

![image-20250516140114818](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250516140114818.png)





## 二.方法

![image-20250516140823021](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250516140823021.png)

```java
public class listMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("fy");
        list.add("szj");

        list.add(2,"ai");//在index位置插入一个元素
        System.out.println(list);

        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("mary");
        list.addAll(1,list2);//在index位置插入多个元素
        System.out.println(list);

        System.out.println(list.indexOf("szj"));//返回首次出现的位置

        list.add("fy");
        System.out.println(list.lastIndexOf("fy"));//返回最后一次出现的位置

        list.remove(0);//移除指定位置的元素，并返回此元素
        System.out.println(list);

        list.set(1,"mali");//替换index处的元素为
        System.out.println(list);

        List list3 = list.subList(1,3);//返回从fromIndex到toIndex位置的子集合 [1,3)
        System.out.println(list3);
    }
}
```



**测试：**

![image-20250516145857389](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250516145857389.png)

![image-20250516145722819](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250516145722819.png)