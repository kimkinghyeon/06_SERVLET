<%--
  Created by IntelliJ IDEA.
  User: 80401
  Date: 2024-07-04
  Time: 오전 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%= request.getAttribute("fullName")%>님 환영합니다.</h1>
<h2>1. ${ name } </h2>
<h2>2. ${ param.name } </h2>
<%-- 동일한 키값을 가지게 될 경우 작은 영역부터 넓은 영역으로 우선순위를 가진다.--%>
<%-- page > request > session > context--%>
<h2>3. ${ fullName } </h2>
<h2>3. ${ requestScope.fullName } </h2>
<h2>3. ${ sessionScope.fullName } </h2>
<h2>4. ${ member } </h2>

</body>
</html>
