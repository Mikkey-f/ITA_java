package com.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//注解由类名字典序决定执行顺序
@WebFilter("/*")
public class Fileter3 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter3 before doFilter invoked");
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("filter3 after  invoked");
    }
}
