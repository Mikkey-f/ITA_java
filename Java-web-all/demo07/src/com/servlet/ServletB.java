package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reuest = (String)req.getAttribute("reuest");
        System.out.println("请求域"+reuest);

        HttpSession session = req.getSession();
        String session1 =(String) session.getAttribute("session");
        System.out.println("会话域"+session1);

        ServletContext application = getServletContext();
        String application1 = (String) application.getAttribute("application");
        System.out.println("应用域"+application1);
    }
}
