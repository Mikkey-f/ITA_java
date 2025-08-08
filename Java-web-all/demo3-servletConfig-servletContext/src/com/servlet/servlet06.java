package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet06")
public class servlet06 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info="<h1>hello</h1>";
        //设置响应行相关的API   HTTP/1.1 200/404/405/500...
        resp.setStatus(405);
        //设置响应头相关的API
        //resp.setHeader("aaa","valuea");
        //resp.setHeader("Content-Type","text/html");
        resp.setContentType("text/html");
        //resp.setContentLength(1234);
        resp.setContentLength(info.length());

        //设置响应体内容的API

        PrintWriter writer = resp.getWriter();
        writer.write(info);

        //获得一个向响应体中输入二进制信息的字节输出流
        ServletOutputStream outputStream = resp.getOutputStream();
    }
}
