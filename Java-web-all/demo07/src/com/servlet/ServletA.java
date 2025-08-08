package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("reuest","requestMessage");

        HttpSession session = req.getSession();
        session.setAttribute("session","sessionMessage");

        ServletContext application = getServletContext();
        application.setAttribute("application","applicationMessage");

        String reuest = (String)req.getAttribute("reuest");
        System.out.println("请求域"+reuest);

        //请求转发
        //req.getRequestDispatcher("servletB").forward(req,resp);
    }
}
