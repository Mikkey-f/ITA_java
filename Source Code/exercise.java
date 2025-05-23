package genericDetail;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 司志俊
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class exercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("szj", 25000, new MyDate(2005, 5, 20)));
        employees.add(new Employee("fy", 15000, new MyDate(2007, 12, 10)));
        employees.add(new Employee("zzt", 5000, new MyDate(2006, 3, 28)));
        employees.add(new Employee("szj", 25000, new MyDate(2006, 3, 28)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int name = o1.getName().compareTo(o2.getName());
                if (name != 0){
                    return name;
                }
                else {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });

        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {//把对year-month-day的比较放在这里
        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }
        return day - o.getDay();

    }
}