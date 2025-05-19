package Set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Exercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Mydate mydate1 = new Mydate(2005, 5, 20);
        Mydate mydate2 = new Mydate(2007, 12, 10);
        hashSet.add(new Employee1("szj",mydate1));
        hashSet.add(new Employee1("fy",mydate2));
        hashSet.add(new Employee1("szj",mydate1));
        System.out.println(hashSet);
    }
}
class Employee1{
    private String name;
    Mydate birthday;

    public Employee1(String name, Mydate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}
class Mydate{
    int n;
    int m;
    int d;

    public Mydate(int n, int m, int d) {
        this.n = n;
        this.m = m;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "n=" + n +
                ", m=" + m +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return n == mydate.n && m == mydate.m && d == mydate.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, m, d);
    }
}