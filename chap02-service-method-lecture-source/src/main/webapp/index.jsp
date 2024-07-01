<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>service() 메소드의 역할</h1>
<h2>Get 방식의 요청</h2>
<h3>a 태그의 href 속성값 변경</h3>
<a href="request-service">서비스 메소드 요청</a>
<h4>from 태그의 method 속성을 get 으로 설정</h4>
<%--
from 태그 : 사용자의 입력을 받을 때 사용한다.
    action : 입력한 데이터를 제출할 떄 사용할 url
    method : 어던 http 메소드를 사용할지 결정
input 태그 : 다양한 형태의 일력 필드생성
    submit : 버튼을 누르면 서버로 입력받은 데이터 전송
--%>
<form action="request-service" method="get">
    <input type="submit" value="get 방식 요청 전송">
</form>


<h2>post 방식의 요청</h2>
<h3>a 태그의 href 속성값 변경</h3>
<a href="request-service">서비스 메소드 요청</a>
<h4>from 태그의 method 속성을 post 으로 설정</h4>
<form action="request-service" method="post">
    <input type="submit" value="post 방식 요청 전송">
</form>
</body>
</html>