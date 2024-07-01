package com.ohgiraffers.seciton01.queryString;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/querystring")
// url 소문자로 하는것이 암묵적으로 약속
public class QueryStringTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        HttpServlet 클래스의 service method 는 요청 방식에 따라
        Get 요청에 대해서는 doGet() 메소드를 호출하고, request , response 를 전달한다.
        * * */

        // Service 로 부터 전달받은 HttpServletRequest 는
        // 요청시 전달한 값을 getParameter() 메소드로 추출 할 수 있다.
        String name = request.getParameter("name");
        System.out.println("이름 :  " + name);
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("나이 : " + age);
        LocalDate birthDay = LocalDate.parse(request.getParameter("birthday"));
        System.out.println("birthDay : " + birthDay);
        String gender = request.getParameter("gender");
        System.out.println("gender : " + gender);
        String national = request.getParameter("national");
        System.out.println("national : " + national);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
