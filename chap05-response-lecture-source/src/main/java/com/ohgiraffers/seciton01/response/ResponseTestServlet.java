package com.ohgiraffers.seciton01.response;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    /*
    서블릿이 하는 역할은 크게 3가지이다.
    1. 요청받기 - HTTP method GET/POST 요청에 따라 parameter 로 전달받은 데이터를 꺼낼 수 있다.
    2. 바즈니스 로직 처리 - DB 접속과 CRUD 에 대한 로직 처리 -> 서비스를 호출하는 쪽으로 해결한다.(MVC)
    3. 응답하기 - 문자열로 동적인 웹(HTML 태그) 페이즈를 만들고 스트림을 이용해 내보낸다.
    * */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 사용자 브라우저에 응답하기 위해서 HttpSServletResponse 의 getWriter () method 로 PrintWriter
        // 인스턴스를 반환 받는다.
        // PrintWriter 는 BufferedWriter 의 형제격인 클래스이지만 더 많은 생성자를 제공하고
        // 있는 범용성으로 인해 더 많이 사용된다.
        PrintWriter out = response.getWriter();
        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>")
                .append("<html \n>")
                .append("<head \n>")
                .append("</head> \n>")
                .append("<body \n>")
                .append("<h1>hello servlet Response</h1>")
                .append("<h1>안녕 서블릿 리스폰스</h1>")
                .append("</body>")
                .append("</html>");

        // 브라우저로 내버낼 데이터의 타입을 응답 헤더에 설정 해줘야한다.
        // default type 이 null 이기 때문에 수정이 필요
        System.out.println("default response type : " + response.getContentType());
//        response.setContentType("text/html");
        // 문자열 그대로 출력하는 방식
        response.setContentType("text/plain");

        // 추가사항 : 인코딩 방식변경
        response.setCharacterEncoding("UTF-8");

        // 인코딩과 MIME 타입을 한번에 설정 할 수 있다.
//        response.setContentType("text/html;charset=UTF-8");

        out.println(responseBuilder.toString());
        out.flush(); // 버퍼공간에서 내보낼때 사용
        out.close();
    }


}
