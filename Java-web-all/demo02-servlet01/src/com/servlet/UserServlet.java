package com.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//步骤1 开发一个web类型的module
//步骤2 开发一个UserServlet
//步骤3 在web.xml为UseServlet配置请求的映射路径
//步骤4 开发一个form表单,向servlet发送一个get请求并携带username参数

//1. Content-Type响应头的问题:
/*
   MIME类型响应头 媒体类型,文件类型,响应的数据类型
   MIME类型用于告诉客户端响应的数据是什么类型的数据, 客户端以此决定如何解析

 */

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1 从request 对象中获取请求的任何信息(username参数)
        String username = request.getParameter("username");
        // 2 处理业务的代码
        String info="<h1>YES</h1>";
        if("zhangsan".equals(username)){
            info="NO";
        }

        // 3 将要响应的数据放入response
        //应该设置Content-Type响应头
        //response.setHeader("Content-Type","text/html");
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();//该方法返回的是一个向响应体中打印字符串的打印流
        writer.write(info);
    }
}
