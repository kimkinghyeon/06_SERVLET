package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(session).firstName = " + firstName);
        System.out.println("(session).lastName = " + lastName);

        // 세션 만들기
        HttpSession session = request.getSession();

        // HttpSession 의 기본 유지 시간은 30분으로 지정된다.

        // session 유지시간 설정
        session.setMaxInactiveInterval(60 * 10); // 10분
        System.out.println("변경후 session 유지시간 = " + session.getMaxInactiveInterval());
        System.out.println("session id = " + session.getId());

        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);

        response.sendRedirect("redirect");


    }
}
