package com.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();

        //获得一个指向项目部署位置下的某个文件/目录的磁盘真实路径的API
        String path = servletContext.getRealPath("upload");
        System.out.println(path);

        // 获得项目部署的上下文路径  项目的访问路径
        // 后续会学习在项目中使用相对和绝对路径找目标资源
        // 获得项目的上下文路径  项目的访问路径
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);

        //向域中存储/修改数据
        servletContext.setAttribute("ka","va");
       servletContext.setAttribute("ka","vaa");
        //获得域中的数据
       // servletContext.getAttribute("ka");
        //移除域中的数据
        //servletContext.removeAttribute("ka");


    }
}
