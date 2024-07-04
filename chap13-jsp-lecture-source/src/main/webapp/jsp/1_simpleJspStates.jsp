<%--
페이지 지시자 태그
페이지에 대한 설정을 하는 태그
현재 페이지에 스크립트 태그를 이용하여 작성하는 문법은
Java 라는 의미
response hender 에 응답을 위한 설정도 가능
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- HTML 주석 -->
<%-- JSP 주석--%>
<%-- HTML 주석은 클라이언트에 노출되지만 JSP 주석은 클라이언트에게 노출되지 않는다. --%>
<%-- 선언태그
서블릿으로 변환 시 선언 태그 내에 작성한 내용을 필드로 선언한다.
--%>
<%!
    private String name;
    private int age;
%>
<%-- scriptlet 태그--%>
<%
    // 간단한 자바 코드를 작성할 수 있다.
    // 자바코드 이기 때문에 ;(세미콜론)을 작성하지 않으면 compile 과정에서 에러가 발생한다.
    name = "홍길동";
    age = 20;
    System.out.println("name = " + name);
    System.out.println("age = " + age);
    for (int i = 0; i < name.length(); i++){
        System.out.println(name.charAt(i));
    }
    String another = "아무거나";
%>

<%-- expression 태그 --%>
name : <%= name %>
<br>
age : <%= age %>
<br>
another : <%= another %>
</body>
</html>
