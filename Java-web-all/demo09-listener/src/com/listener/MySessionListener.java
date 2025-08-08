package com.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        //任何一个session域对象的创建都会触发该方法的执行
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        //任何一个session域对象的销毁都会触发该方法的执行
    }
}
