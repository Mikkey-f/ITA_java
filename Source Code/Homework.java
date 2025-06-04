package com.szj.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Homework {
    public static void main(String[] args) throws Exception{
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestOdj = privateTestClass.newInstance();
        //得到name属性
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestOdj,"八部天龙");

        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTestOdj);
        System.out.println("name属性的值=" + invoke);
    }
}

class PrivateTest {
    private String name = "hellokitty";

    public String getName(){
        return name;
    }
}