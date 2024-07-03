package com.ohgiraffers.section03.request;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request 에 attribute 를 추가할 때 attributeAdded() 메소드가 동작한다.
        request.setAttribute("username","hong");
        request.setAttribute("age",20);
        request.setAttribute("gender","M");

        // request 에 attribute 를 동일한 key 로 덮어 쓰는 경우
        // attributedReplaced 메소드가 동작한다.
        request.setAttribute("username","honghong");

        // request 에 attribute 를 제거할 때 attributeRemoved() 가 동작한다.
        request.removeAttribute("gender");
    }


}
