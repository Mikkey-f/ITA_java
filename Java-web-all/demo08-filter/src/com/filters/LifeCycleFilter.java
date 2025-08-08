package com.filters;

import jakarta.servlet.*;

import java.io.IOException;

public class LifeCycleFilter implements Filter {

    public LifeCycleFilter(){
        System.out.println("构造");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化");
        System.out.println(filterConfig.getInitParameter("dataTimePattern"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
