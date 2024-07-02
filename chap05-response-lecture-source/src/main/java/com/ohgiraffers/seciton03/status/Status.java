package com.ohgiraffers.seciton03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/status")
public class Status extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 200, 400, 401, 404, 500

        response.sendError(200, "요청이 성공적으로 되었습니다. 성공의 의미는 HTTP 메소드에 따라 달라집니다: GET: 리소스를 불러와서 메시지 바디에 전송되었습니다. HEAD: 개체 해더가 메시지 바디에 있습니다. PUT 또는 POST: 수행 결과에 대한 리소스가 메시지 바디에 전송되었습니다. TRACE: 메시지 바디는 서버에서 수신한 요청 메시지를 포함하고 있습니다.");
        response.sendError(400, "이 응답은 잘못된 문법으로 인하여 서버가 요청을 이해할 수 없음을 의미합니다.");
        response.sendError
                (401, "비록 HTTP 표준에서는 \"" +
                        "미승인(unauthorized)\"" +
                        "를 명확히 하고 있지만, 의미상 이 응답은 \"" +
                        "비인증(unauthenticated)\"" +
                        "을 의미합니다. 클라이언트는 요청한 응답을 받기 위해서는 반드시 스스로를 인증해야 합니다.");
        response.sendError(404, "없는 페이지 입니다. 경로를 확인해 주세요");
        response.sendError(500, "서버가 처리 방법을 모르는 상황이 발생했습니다. 서버는 아직 처리 방법을 알 수 없습니다.");

    }

}
