package com.ohgiraffers.section02.otherservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("이 서블릿으로 Redirect 성공!");

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>")
                .append("<html>")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append("<h1>이 서블릿으로 redirect 성공!</h1>\n")
                .append("</body>")
                .append("</html>");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(responseBuilder.toString());
        out.flush();
        out.close();

        /*
        redirect 하면 url 이 재작성되어 새로고침 할 때 redirect 된 페이지에 대한 요청을 반복한다.
        즉. 이러한 요청에 포함된 정보는 남아있지 않고 url 이 변경되는 것이 redirect 의 특징
        따라서 첫 요청 시의 request 와 현재 redirect 된 페이지의 request 는 서로 다른 객체이므로
        redirect 를 쓰면 이전 서블릿의 값을 고유해서 사용할 수 없다.
        * */
    }

}
