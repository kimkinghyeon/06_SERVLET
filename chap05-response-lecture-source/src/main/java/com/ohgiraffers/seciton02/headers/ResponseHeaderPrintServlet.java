package com.ohgiraffers.seciton02.headers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/headers")
public class ResponseHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        // currentTimeMillis : 현재 시간을 밀리초로 반환
        long currentTime = System.currentTimeMillis();

        response.setHeader("Refresh","1");

        out.println("<h1>" + currentTime + "</h1>");
        out.flush();
        out.close();

        // 응답헤더에 담기는 내용 확인하기
        Collection<String> responseHeaders = response.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();

        while (iter.hasNext()) {
            String headerName = iter.next();
            System.out.println(headerName + " : " + response.getHeader(headerName));
        }
    }

}
