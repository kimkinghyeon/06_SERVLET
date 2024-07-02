package com.ohgiraffers.section01.headers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/headers")
public class RequestHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
헤더의 종류 4가지
1. General header
요청 및 응답 모두에 적용되지만 최종적으로 body 에 전송되는 것과 관련이 없는 헤더
2. Request header
Fetch 될 리소스나 클라언트 자체에 대한 상제 정보를 포함하는 헤더
3. Response header
워치나 서버 자체와 같은 응답에 대한 부가적인 정보를 갖는 헤더
4. Entity header
컨텐츠나 길이나 MIME 타입과 같은 엔티티 body 에 대한 상세 정보를 포함하는 헤더
(요청 응답 모두 사용되며, 메시지 바디의 컨텐츠를 나타내기에 GET 요청은 해당되지 않는다.)
* */
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }
        // accept : 요청을 보낼때 서버에게 요청할 응답 타입을 명시
        System.out.println("accept : " + request.getHeader("accept"));
        // accept-encoding : 응답시 원하는 인코딩 방식
        System.out.println("accept-encoding : "  + request.getHeader("accept-encoding"));
        // accept-language : 응답시 원하는 언어
        System.out.println("accept-language : "  + request.getHeader("accept-language"));
        // connection : HTTP 통신이 완료된 후에 네트워크 접속을 유지할지 결정(기본값 KEEP-ALIVE = 연결을 열린상태로 유지)
        System.out.println("connection : "  + request.getHeader("connection"));
        // host : 서버의 도메인 네임과 서버가 현재 LISTENING 중인 TCP 포트 지정 (반드시 하나가 존재하고 두개인 404ERROR)
        System.out.println("host : "  + request.getHeader("host"));
        // referer : 이 페이지 이전에 대한 주소
        System.out.println("referer : "  + request.getHeader("referer"));
        // sec-fetch-dest : 요청 대상
        System.out.println("sec-fetch-dest : " + request.getHeader("sec-fetch-dest"));
        // sec-fetch-mode : 요청 모드
        System.out.println("sec-fetch-mode : " + request.getHeader("sec-fetch-mode"));
        // sec-fetch-site : 출처(ORIGIN)와 요청된 RESOURCE 사이의 관계
        System.out.println("sec-fetch-site : " + request.getHeader("sec-fetch-site"));
        // sec-fetch-user : 사용자가 시작한 요청일 때만 보내질 (항상 ?1 값을 가짐)
        System.out.println("sec-fetch-user : " + request.getHeader("sec-fetch-user"));
        // cache-control : 캐시설정
        System.out.println("cache-control : " + request.getHeader("cache-control"));
        // upgrade-insecure-request : 클라이언트가 서버한테 HTTP -> HTTPS 로 업그레이드를 요청할때 사용
        System.out.println("upgrade-insecure-request : " + request.getHeader("upgrade-insecure-request"));
        // user-agent : 현재 사용자가 어떤 클라이언트(OS, BROWSER)를 이용해 보내 요청이자 명시
        System.out.println("user-agent : " + request.getHeader("user-agent"));
    }
}
