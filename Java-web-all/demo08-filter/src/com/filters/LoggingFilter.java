package com.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingFilter implements Filter {
    private SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;

        //请求到达目标资源之前的代码  打印日志   yyyy-MM-dd HH:mm:ss ***被访问了
        String requestURI = request.getRequestURI();
        String dateTime = dateFormat.format(new Date());
        String beforeLogging=requestURI+"在"+dateTime+"被访问了";
        System.out.println(beforeLogging);

        //System.out.println("loggingFilter before filterChain.doFilter invoked");

        long l1 = System.currentTimeMillis();
        //放行
        filterChain.doFilter(servletRequest,servletResponse);

        long l2 = System.currentTimeMillis();
        //响应之前的功能代码  ***资源在 yyyy-MM-dd HH:mm:ss 的请求 耗时 毫秒

        String afterLogging=requestURI+"资源在"+dateTime+"的请求耗时:"+(l2-l1) +"毫秒";
        System.out.println(afterLogging);
        //System.out.println("loggingFilter after filterChain.doFilter invoked");
    }
}
