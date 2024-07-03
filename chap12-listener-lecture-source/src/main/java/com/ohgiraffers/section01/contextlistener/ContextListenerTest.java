package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

    /*
    리스너
    리스너는 특정 이벤트 행위가 동작할 때 컨테이너에 의해 호출되는
    메소드를 인터페이스에 정의해둠
    이를 상속받아 구현한 메소드가 특정 이벤트 발생에 대해
    필요한 로직을 작성한다.
    1.context -> (톰켓 컨테이너 자체에 리스너를 연결)
    1-1. ServletContextListener :
    웹 어플리케이션의 시작, 종료에 대한 이벤트리스너
    1-2. ServletContextAttributeListener :
    context 와 attribute 를 추가,제거,수정에 대한 이벤트 리스너
    */

    public ContextListenerTest() {
        // context 가 생성될 때 변화를 감지하는 Listener 인스턴스가 생성된다.
        System.out.println("context listener 인스턴스생성");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // context 가 최초 생성될 때 생성자 호출 이후 동작하는 메소드
        System.out.println("context init");
        ServletContextListener.super.contextInitialized(sce);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // context 가 소멸할때 때 생성자 호출 이후 동작하는 메소드
        System.out.println("context destroy");
        ServletContextListener.super.contextDestroyed(sce);
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        // context 에 attribute 가 추가될떄 동작하는 메소드
        System.out.println("context attribute");
        ServletContextAttributeListener.super.attributeAdded(event);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        // context 에 attribute 가 제거될 때 동작하는 메소드
        System.out.println("context attribute removed");
        ServletContextAttributeListener.super.attributeRemoved(event);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        // context 에 attribute 가 수정될 때 동작하는 메소드
        System.out.println("context attribute replaced");
        ServletContextAttributeListener.super.attributeReplaced(event);
    }
}
