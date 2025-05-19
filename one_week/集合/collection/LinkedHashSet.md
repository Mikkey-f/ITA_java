# LinkedHashSet

## 一.说明

![image-20250519155407674](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519155407674.png)





## 二.底层机制

![image-20250519191512212](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519191512212.png)

```java
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("szj",1001));
        set.add(123);
        set.add("HSP");
        System.out.println("set="+set);
        //LinkedHashSet 加入和取出元素/数据的顺序一致
        //LinkedHashSet 底层维护的是一个LinkedHashMap
        //LinkedHashSet 底层结构 (数组table+双向链表)
        //第一次添加时，直接将 数组table扩容到16，存放的结点类型是LinkedHashMap$Entry
        //数组类型是 HashMap$Node 存放的元素是 LinkedHashMap$Entry类型
    }
}
class Customer{
    String name;
    int num;

    public Customer(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
```



## 三.习题

![image-20250519194653031](C:\Users\24709\AppData\Roaming\Typora\typora-user-images\image-20250519194653031.png)

```java
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥迪", 1000000));//ok
        linkedHashSet.add(new Car("大众", 100000));//ok
        linkedHashSet.add(new Car("五菱宏光", 9500));//ok
        linkedHashSet.add(new Car("奥迪", 1000000));//no
        System.out.println("LinkedHashSet="+linkedHashSet);
    }
}

class Car {
    String name;
    int price;

    public Car(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
```

