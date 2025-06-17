package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
Servlet在tomcat中是单例的
Servlet的成员变量在多个线程栈之中是共享的
不建议在service方法中修改成员变量, 在并发请求时,会引发线程安全问题
default-servlet 用于加载静态资源的servlet, 默认随服务启动,默认启动序号为1

default-servlet
 */
@WebServlet(value = "/servletLifeCycle",loadOnStartup = 6)
public class ServletLifeCycle extends HttpServlet {
    public ServletLifeCycle(){
        System.out.println("构造器");
    }
    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }


}
