package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//客户端获得cookie
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建cookie
        Cookie cookie1 = new Cookie("keya","valuea");
        // 设置cookie 存在时间
        //cookie1.setMaxAge(60*5);  // 秒

        // 设置cookie的提交路径
        cookie1.setPath("/demo06/servletB");
        Cookie cookie2 = new Cookie("keyb","valueb");

        // 将cookie放入response对象
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);

    }
}
