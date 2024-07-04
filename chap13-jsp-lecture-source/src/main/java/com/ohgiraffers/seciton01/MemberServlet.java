package com.ohgiraffers.seciton01;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("요 청 확 인");
        String name = request.getParameter("name");
        System.out.println(name);

        String fullName = "킹" + name;
        request.setAttribute("fullName", fullName);

        Member member = new Member("킹강현",20);
        request.setAttribute("member",member);

        HttpSession session = request.getSession();
        session.setAttribute("fullName","킹킹킹강현");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/testForward.jsp");
        dispatcher.forward(request, response);
    }
}
