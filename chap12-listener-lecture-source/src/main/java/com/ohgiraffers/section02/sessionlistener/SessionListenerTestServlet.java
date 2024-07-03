package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/section")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 세션 만들기
        HttpSession session = request.getSession();
        System.out.println("발급받은 session id : " + session.getId());

        // session 만료하게 되면 sessionDestroyed()가 된다.
        // session.setMaxInactiveInterval(5);
//        session.invalidate();

        // session 에 attribute 를 추가할 떄 attributeAdded() 메소드가 동작한다.
        session.setAttribute("username","honggildong");
        session.setAttribute("age",20);

        session.setAttribute("user",new UserDTO());

        // session attribute 에 동일한 키로 덮어 쓰는 경우 (수정) attributeReplaced 메소드가 동작
        session.setAttribute("username","hong");
        // session 에서 attribute 를 제거하면 attributeRemoved() 메소드가 동작한다.
        session.removeAttribute("username");
    }


}
