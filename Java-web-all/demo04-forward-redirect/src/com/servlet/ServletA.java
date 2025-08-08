package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletA 执行了");
        String money = req.getParameter("money");
        System.out.println("servletA获得参数:money="+money);
        //请求转发给ServletB
        //获得请求转发器
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletB");
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("a.html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/b.html");
        //让请求转发器做出转发动作
        requestDispatcher.forward(req,resp);
    }
}
