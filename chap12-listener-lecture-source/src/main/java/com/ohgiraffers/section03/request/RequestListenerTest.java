package com.ohgiraffers.section03.request;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {
    /*
    3. request
    3-1 ServletRequestListener
    ServletRequest 의 생성과 소멸에 대한 이벤트 리스너
    3-2 ServletRequestAttributeListener
    ServletRequest 에 attribute 를 추가,제거,수정 하는것에 대한 이벤트리스너
    * * */

    public RequestListenerTest() {
        // context 가 로드될 때 생성자를 호출해서 인스턴스가 생성된다.
        System.out.println("request listener 인스턴스 생성");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // request 가 생성될 때 호출된다.
        System.out.println("request init!");
        ServletRequestListener.super.requestInitialized(sre);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // request 가 소멸될 때 호출된다.
        System.out.println("request destroyed!");
        ServletRequestListener.super.requestDestroyed(sre);
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        // request 에 attribute 가 추가 될때 호출된다.
        System.out.println("request attribute added!");
        ServletRequestAttributeListener.super.attributeAdded(srae);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        // request 에 attribute 가 소멸 될때 호출된다.
        System.out.println("request attribute destroyed!");
        ServletRequestAttributeListener.super.attributeRemoved(srae);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        // request 에 attribute 가 수정 될때 호출된다.
        System.out.println("request attribute replaced!");
        ServletRequestAttributeListener.super.attributeReplaced(srae);
    }
}
