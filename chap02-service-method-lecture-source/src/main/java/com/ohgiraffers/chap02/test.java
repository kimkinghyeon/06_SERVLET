package com.ohgiraffers.chap02;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/request-service")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
