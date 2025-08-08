package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/servletC")
public class ServletC extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应体使用UTF-8 来进行编码
        resp.setCharacterEncoding("UTF-8");
        // 设置Content-Type, 告诉客户端用UTF-8来进行解码
        resp.setContentType("text/html;charset=UTF-8");

        // 向客户端响应一些文字
        resp.getWriter().write("你好 hello");
        /*
        tomcat10中, 响应体默认的编码字符集是UTF-8
        解决思路:
        1. 可以设置响应体的编码字符集和客户端 的保持一致 不推荐 客户端解析的字符集无法预测
        2. 可以告诉客户端使用指定的字符集进行解码  通过设置Content-Type响应头

         */
    }
}
