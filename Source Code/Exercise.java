package map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Exercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Emp("sizhijun",  25000,1));
        map.put(2,new Emp("fy", 8000,2));
        map.put(3,new Emp("f",12000,3));

        Set keySet = map.keySet();
        for (Object key : keySet) {
            //先获取value
            Emp emp = (Emp) map.get(key);
            if (emp.getSalary() > 18000){
                System.out.println(emp);
            }
        }

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =(Map.Entry) iterator.next();
            Emp emp = (Emp)entry.getValue();
            if (emp.getSalary() >= 18000){
                System.out.println(emp);
            }
        }
    }
}
class Emp{
    private String name;
    private double salary;
    int id;

    public Emp(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}