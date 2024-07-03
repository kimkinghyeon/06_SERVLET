package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {

    private String encodingType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type");
        System.out.println(encodingType);

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        if ("Post".equals(httpServletRequest.getMethod())) {
            System.out.println("기존 인코딩 타입 : " + httpServletRequest.getCharacterEncoding());
            httpServletRequest.setCharacterEncoding("UTF-8");
            System.out.println("변경된 인코딩 타입 : " + httpServletRequest.getCharacterEncoding());
        }
        filterChain.doFilter(httpServletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
