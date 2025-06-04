package com.szj.class_;

import com.szj.Car;

import javax.xml.transform.Source;
import java.lang.reflect.Field;

/**
 * @author 司志俊
 * @version 1.0
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws Exception {
        String classAllPath = "com.szj.Car";
        //1. 获取Car类对应的Class对象
        //<?> 表示不确定的Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2. 输出cls
        System.out.println(cls);//显示cls对象是哪个类的Class对象 com.szj.Car
        System.out.println(cls.getClass());//输出运行类型 java.lang.Class
        //3. 得到包名
        System.out.println(cls.getPackage().getName());
        //4. 得到全类名
        System.out.println(cls.getName());
        //5.通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        //6.通过反射获取属性，该属性不能是私有的
        Field brand = cls.getField("brand");
        System.out.println(brand);//宝马
        //7.通过反射给属性赋值
        brand.set(car,"奔驰");
        //8.希望可以得到所有的属性
        Field[] fields = cls.getFields();
        for (Field f : fields){
            System.out.println(f.getName());
        }
    }
}
