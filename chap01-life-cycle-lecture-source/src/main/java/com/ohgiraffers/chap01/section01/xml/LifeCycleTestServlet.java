package com.ohgiraffers.chap01.section01.xml;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet {
    // 각 메소드 마다 호출 횟수를 카운트 할 목적의 필드
    private  int initCount = 1;
    private  int serviceCount = 1;
    private  int destroyCount = 1;

    // 기본생성자

    public LifeCycleTestServlet() {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("xml 매핑 init() 메소드호출" + initCount);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        /*
        서블릿 컨테이너에 의해 호출되어 최초 요청시에는 init() 이후에 동작하고,
        두 번째 요청부터는 init() 호출없이 바로 service()를 호출한다.
        * */
        System.out.println("xml 매핑 service() 메소드호출" + serviceCount);
    }



    @Override
    public void destroy() {
        super.destroy();
        System.out.println("xml 매핑 destroy() 메소드호출" + destroyCount);
    }
}
