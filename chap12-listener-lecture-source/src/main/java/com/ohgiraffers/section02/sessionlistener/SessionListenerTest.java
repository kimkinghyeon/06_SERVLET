package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener , HttpSessionAttributeListener {
    /*
    Session
    2-1. HttpSessionListener
    Http 세션의 시작, 종료에 대한 리스너
    2-2. HttpSessionAttributeListener
    HttpSession 에 attribute 가 추가,제거,수정에 대한 리스너
    * */

    public SessionListenerTest() {
        // context 가 로드될 때 인스턴스가 생성된다
        System.out.println("session listener constructor");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("=======================================새로운 세션 생성이후========================================");
        System.out.println("session created!");
        System.out.println("created session : " + se.getSession().getId());
        HttpSessionListener.super.sessionCreated(se);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session destroyed!");
        HttpSessionListener.super.sessionDestroyed(se);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {

        System.out.println("session attribute added!");
        HttpSessionAttributeListener.super.attributeAdded(event);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // session 에 attribute 가 삭제될때 작동한다.
        System.out.println("session attribute removed!");
        HttpSessionAttributeListener.super.attributeRemoved(event);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // session 에 attribute 가 수정될때 작동한다.
        System.out.println("session attribute replaced!");
        HttpSessionAttributeListener.super.attributeReplaced(event);
    }
}
