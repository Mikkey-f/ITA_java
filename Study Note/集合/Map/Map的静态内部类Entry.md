# Map的静态内部类Entry

## 一.介绍

在 Java 中，`Map.Entry<K, V>` 是 `Map` 接口的一个 **静态嵌套泛型接口**，用于表示 `Map` 中的一个键值对（key-value 对）。它定义了与键值对相关的操作方法，是处理 `Map` 中元素的重要接口。`Map.Entry` 是 `Map` 的静态成员接口，可直接通过 `Map.Entry` 引用，无需额外导入。



## 二.实现

```java
public static interface Map.Entry<K, V> {  
    K getKey();          // 获取键  
    V getValue();        // 获取值  
    V setValue(V value); // 修改值，返回旧值  
    boolean equals(Object o); // 判断两个 Entry 是否相等（键和值均相等时才相等）  
    int hashCode();      // 返回 Entry 的哈希值（通常基于键和值计算）  
}  
```

- **`getKey()`**：返回当前键值对中的键（类型为 `K`）。
- **`getValue()`**：返回当前键值对中的值（类型为 `V`）。
- **`setValue(V value)`**：用指定值替换当前值（可选操作），返回被替换的旧值。
- **`equals(Object o)`**：比较两个 `Entry` 是否相等，需键和值都相等才返回 `true`。
- **`hashCode()`**：返回 `Entry` 的哈希值，确保与 `equals` 方法一致（相等的 `Entry` 哈希值相同）。



### 三.应用场景

1. **遍历 `Map` 的键值对**
   通过 `Map` 的 `entrySet()` 方法获取 `Set<Map.Entry<K, V>>`，再遍历该集合，可直接获取键和值，比先通过 `keySet()` 再调用 `get(key)` 更高效。

```java
Map<String, Integer> map = new HashMap<>();  
map.put("A", 1);  
map.put("B", 2);  
for (Map.Entry<String, Integer> entry : map.entrySet()) {  
    String key = entry.getKey();  
    Integer value = entry.getValue();  
    System.out.println("Key: " + key + ", Value: " + value);  
}  
```

2.**修改值**
利用 `setValue(V value)` 直接修改键值对中的值。

```java
for (Map.Entry<String, Integer> entry : map.entrySet()) {  
    entry.setValue(entry.getValue() * 2); // 将值乘以 2  
}  
```

1. **条件操作**
   结合集合操作（如 `removeIf`）筛选或删除特定键值对。

   ```java
   map.entrySet().removeIf(entry -> entry.getValue() < 10); // 删除值小于 10 的键值对  
   ```

   