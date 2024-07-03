package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        System.out.println("name = " + name);
        System.out.println("userId = " + userId);
        System.out.println("password = " + password);

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("비밀번호가 pass01 인지 확인 : " + passwordEncoder.matches("pass01", password));
        System.out.println("비밀번호가 pass02 인지 확인 : " + passwordEncoder.matches("pass02", password));


    }
}
