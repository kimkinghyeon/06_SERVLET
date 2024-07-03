package com.ohgiraffers.section02.delete;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("요청이 왔음");
        
        HttpSession session = request.getSession();
        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()){
            System.out.println("sessionNames.nextElement() = " + sessionNames.nextElement());
        }
        /*
        세션 데이터를 지우는 방법
        1. 설정한 만료시간이 지나면 세션이 만료된다.
        2. removeAttribute()로 session 의 Attribute 를 지운다.
        3. invalidate() 를 호출하면 세션의 모든 데이터가 제거된다.
        * */

//        System.out.println("firstName 지우기");
//        session.removeAttribute("firstName");
//        sessionNames = session.getAttributeNames();
//        while (sessionNames.hasMoreElements()){
//            System.out.println(sessionNames.nextElement());
//        }

        System.out.println("invalidate");
        session.invalidate();
        sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()){
            System.out.println(sessionNames.nextElement());
        }

    }

}