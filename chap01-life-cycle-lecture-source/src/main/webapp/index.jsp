<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%--
HTML (Hyper Text Markup Language)
- 웹 페이지와 웹 어플리케이션을 위한 표준 마크업 언어
- 웹페이지의 구조를 정의한다.
- 텍스트, 이미지, 링크, 폼, 테이블 등 다양한 요소를 웹페이지에 추가
(head) : 헤더영역, 타이틀, 메타데이터, 외부리소스 링크 등이 들어간다.
(body) : 바디영역 (본문)
--%>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- h 태그들 " 제목을 작성할 떄 --%>
<h1><%= "Hello World!" %>
</h1>
<h1>안녕하세여</h1>
<h2>안녕하세여</h2>
<h3>안녕하세여</h3>
<h4>안녕하세여</h4>
<h5>안녕하세여</h5>
<%-- br 태그 : 줄바꿈--%>
<br/>
<%-- a태그 : 다른페이지로 이동할 수 있게 링크를 걸어주는 기능 (href 속성을 이용해 링크 적용) --%>
<a href="hello-servlet">Hello Servlet</a>
<a href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDmqvsw8BeCpfS8649rxDow2mkSu8kwoJOwpfMNiZgMg8skbSgC5DGtE5g5AZmdP8PNuE&usqp=CAU">응애</a>
</body>
</html>