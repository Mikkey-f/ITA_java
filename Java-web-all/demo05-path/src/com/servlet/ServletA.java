package com.servlet;

import jakarta.servlet.ServletContext;
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
        System.out.println("servletA");

        //重定向到ServletB
        /*
           1. 相对路径写法
                 和前端的相对路径规则一致

          2.  绝对路径写法
                 http://localhost:8080/
         */
        //resp.sendRedirect("../../../servletB"); 相对路径
        //resp.sendRedirect("/demo05/servletB");  //绝对路径
//        ServletContext servletContext = req.getServletContext();
//        String contextPath = servletContext.getContextPath();
//        resp.sendRedirect(contextPath+"/servletB");  动态处理上下文变化

        /*请求转发到servletB*/
        /*
            1. 相对路径写法    规则一致
              http://localhost:8080/demo05/servletA

           2.  绝对路径
                  请求转发的绝对路径不需要添加项目上下文
                  请求转发的/  代表的路径是  http://localhost:8080/demo05/

         */

        // 不设置项目的上下文路径, 直接用"/" 替代
        req.getRequestDispatcher("/servletB").forward(req,resp);

    }
}
