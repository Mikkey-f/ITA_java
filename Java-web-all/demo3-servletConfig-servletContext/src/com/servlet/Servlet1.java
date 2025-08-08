package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

//@WebServlet(
//        urlPatterns = "/servlet1",
//        initParams = {@WebInitParam(name="keya",value = "valuea"),@WebInitParam(name = "keyb",value = "valueb")}
//)

public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        // 获取初始配置信息即可
        //根据参数名获取参数值
        String keya = servletConfig.getInitParameter("keya");
        System.out.println("keya:"+keya);

        String keyb = servletConfig.getInitParameter("keyb");
        System.out.println("keyb:"+keyb);
        //获取所有的初始参数的名字
        // hasMoreElements 判断有无下一个参数, 如果有: 返回true 否则返回false
        // nextElement 取出下一个元素,向下移动游标

        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements())
        {
            String pname= initParameterNames.nextElement();
            System.out.println(pname+"="+getInitParameter(pname));
        }
        System.out.println("-----------------------------------------------------------");

        //获取ServletContext
        ServletContext servletContext = this.getServletContext();
        ServletContext servletContext1 = this.getServletConfig().getServletContext();
        ServletContext servletContext2 = req.getServletContext();

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding:"+encoding);
        Enumeration<String> initParameterNames1 = servletContext.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()){
            String pname = initParameterNames1.nextElement();
            System.out.println(pname+"="+servletContext.getInitParameter(pname));
        }
        //从域对象中读取数据
        String ka = (String) servletContext.getAttribute("ka");
        System.out.println(ka);
    }
}
