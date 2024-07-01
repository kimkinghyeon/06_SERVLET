package com.ohgiraffers.chap02;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) request;

        // httpRequest 의 getMethod() : 어떠한 http method 요청인지 문자열로 반환해준다.
        String httpMethod = httpServletRequest.getMethod();
        // A 태그의 href 속성은 화면의 url 내용을 변경하는 방식으로 get 요청에 해당한다.
        System.out.println("httpMethod : "+ httpMethod);

        if ("get".equals(httpMethod)){
            // get 요청을 처리할 메소드로 요청과 응답 정보를 전달한다.
            doGet(httpServletRequest,httpServletResponse);
        } else if (("Post").equals(httpMethod)){
            doPost(httpServletRequest,httpServletResponse);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청을 처리할 메소드호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 요청을 처리할 메소드호출");
    }
}
