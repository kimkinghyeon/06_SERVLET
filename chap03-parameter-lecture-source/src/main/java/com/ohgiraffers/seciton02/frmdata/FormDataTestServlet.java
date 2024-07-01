package com.ohgiraffers.seciton02.frmdata;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import jakarta.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 인코딩 타입 확인
        System.out.println("request : " + request.getCharacterEncoding());

        // post 방식으로 요청 내용을 확인하는 것도 Get 요청으로 파라미터를 처리하는 방식은 동일함
        String name = request.getParameter("name");
        System.out.println("이름 : " + name);

        // 모든 데이터의 key 를 이용해서 전송된 값을 일괄 처리 할 수 있다.
        System.out.println("전달받은 모든 데이터 조회");
        // value 값이 문자열 배열 일 수 도 있기 때문에 String[] 으로 설정
        Map<String, String[]> requestMap = request.getParameterMap();
        Set<String> keySet = requestMap.keySet();
        Iterator<String> keyIter = keySet.iterator();

        while (keyIter.hasNext()){
            String key = keyIter.next();
            String[] value = requestMap.get(key);

            System.out.println("key : " + key);
            for(int i = 0; i < value.length; i++){
                System.out.println("value[" + i + "] : " + value[i]);
            }
        }
        // 파라미터로 전달된 키 목록만 확인
        System.out.println("파라미터로 전달 된 키 목록 확인");
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()){
            System.out.println(names.nextElement());
        }
    }
}
