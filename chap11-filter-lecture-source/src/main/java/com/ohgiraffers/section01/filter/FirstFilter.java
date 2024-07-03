package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

/*
특정 주소에만 필터를 걸고 싶다면
@WebFilter("/first/filter")

* **/
//first 로 시작하는 모든 url 요청에 필터를 건다.
@WebFilter("/first/*")
public class FirstFilter implements Filter {
    // 기본생성자
    // 필터는 톰캣을 status 하는 시점부터 인스턴스를 미리 생성한다.
    public FirstFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        // 필터 인스턴스가 최초 생성될 때 호출되는 메소드
        System.out.println("filter init 호출");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        // 필터 인스턴스가 소멸될 때 호출되는 메소드
        System.out.println("filter destroy 호출");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
// Servlet 으로 request 가 전달되기 전에 요청을 가로채는 역할을 하는 메소드
        System.out.println("Filter doFilter 호출");

        // 필터에서 처리할 크기가 작성되는 공간

        // 처리 이후 다음 필터 혹은 서블릿은 doGet/doPost 를 호출하낟.
        filterChain.doFilter(servletRequest,servletResponse);

        // 서블릿에서 처리 이후에 다시 수행할 내용이 있으면 작성
        System.out.println("Servlet 요청 수행 완료");
    }
}
