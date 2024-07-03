package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(redirect).firstName = " + firstName);
        System.out.println("(redirect).lastName = " + lastName);

        HttpSession session = request.getSession();
        System.out.println("redirect 페이지 session id : " + session.getId());

        // 세션에 담긴 모든 Attribute 키 목록을 반환 받을 수 있다.
        Enumeration<String> sessionName = session.getAttributeNames();
        while (sessionName.hasMoreElements()){
            System.out.println(sessionName.nextElement());
        }

        // 동일한 아이디를 가진 세션에서 setAttribute 해시 값을 지정할 수 있고
        // getAttribute 해시 값을 꺼낼수 있다.
        firstName = (String) session.getAttribute("firstName");
        lastName = (String) session.getAttribute("lastName");

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html\n>")
                .append("<html\n>")
                .append("<head\n>")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3> your first name is ")
                .append(firstName)
                .append(" and last name is ")
                .append(lastName)
                .append("</h3>\n")
                .append("</body>\n")
                .append("</html\n>");

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(responseText.toString());
        out.flush();
        out.close();
    }

}
