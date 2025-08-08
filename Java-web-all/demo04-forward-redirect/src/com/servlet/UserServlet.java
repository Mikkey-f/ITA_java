package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


//GET 乱码问题  form表单提交的参数会放在uri后面, 编码时受charset的影响  sever.xml connector URIEncoding=""

//POST 乱码  form表单提交的参数会放在请求体中, 编码受 charset影响  req.setCharacterEncoding("")
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //tomcat10 默认以UTF-8为请求体的解码字符集
        // 客户端提交数据时, 如果以其他字符集对请求体中的数据进行编码, 则会出现乱码
        //设置请求体解码使用的字符集
        req.setCharacterEncoding("UTF-8");

        System.out.println("username="+req.getParameter("username"));
    }
}
