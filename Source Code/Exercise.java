package map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Exercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        Emp e1 = new Emp("sizhijun", 1, 20000);
        Emp e2 = new Emp("fy", 2, 20000);
        Emp e3 = new Emp("f",3,100000);
        map.put(1,e1);
        map.put(2,e2);
        map.put(3,e3);
        Set keySet = map.keySet();
        for (Object key : keySet) {
            System.out.println(key+ "-" +map.get(key));
        }

    }
}
class Emp{
    private String name;
    private int num;
    private double salary;

    public Emp(String name, int num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", salary=" + salary +
                '}';
    }
}