package Set;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author 司志俊
 * @version 1.0
 */
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