package com.szj.reflection;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author 司志俊
 * @version 1.0
 */
public class Homework02 {

    public static void main(String[] args) throws Exception{
        Class<?> fileCls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器=" + declaredConstructor);
        }

        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String filePath = "d:\\szj99.java";
        Object file = declaredConstructor.newInstance(filePath);
        //file的运行类型就是File
        System.out.println(file.getClass());
        //得到createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println("创建文件成功 " + filePath);
    }

}
