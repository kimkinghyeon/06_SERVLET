<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parameter</title>
</head>
<body>
<h1>Request Parameter</h1>
<h2>GET 방식의 요청</h2>
<h3>from 태그를 이용한 get 방식 요청</h3>
<form action="querystring" method="get">
    <label>이름 : </label><input type="text" name="name">
    <br>
    <label>나이 : </label><input type="number" name="age">
    <br>
    <label>생일 : </label><input type="date" name="birthday">
    <br>
    <label>생별 : </label>
    <input type="radio" name="gender" id="male" value="M"><label for="male">남자</label>
    <input type="radio" name="gender" id="female" value="F"><label for="female">여자</label>
    <br>
    <label>국적 : </label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
        </select>
    <br>
    <label>취미 :</label>
    <input type="checkbox" name="hobbies" id="movie" value="movie"><label for="movie">영화</label>
    <input type="checkbox" name="hobbies" id="music" value="music"><label for="music">음악</label>
    <input type="checkbox" name="hobbies" id="sleep" value="sleep"><label for="sleep">취침</label>
    <br>
    <input type="submit" value="Get 요청">
    <h4>a 태그의 href 속성에 파라미터를 쿼리스트링 형태로 작성하여 get 방식 요청</h4>
    <a href="http://localhost:8080//querystring?name=%EA%B9%80%EA%B0%95%ED%98%84&age=20&birthday=2024-08-28&gender=M&national=ko&hobbies=movie&hobbies=music&hobbies=sleep">
        쿼리스트링을 출력한 (해당 url 에 정보를 수정하면 수정한 값도 출력)
    </a>
</form>

<h2>Post 방식의 요청</h2>
<h3>from 태그를 이용한 get 방식 요청</h3>
<form action="formdata" method="post">
    <label>이름 : </label><input type="text" name="name">
    <br>
    <label>나이 : </label><input type="number" name="age">
    <br>
    <label>생일 : </label><input type="date" name="birthday">
    <br>
    <label>생별 : </label>
    <input type="radio" name="gender" id="male1" value="M"><label for="male1">남자</label>
    <input type="radio" name="gender" id="female1" value="F"><label for="female1">여자</label>
    <br>
    <label>국적 : </label>
    <select name="national">
        <option value="ko">한국</option>
        <option value="ch">중국</option>
        <option value="jp">일본</option>
        <option value="etc">기타</option>
    </select>
    <br>
    <label>취미 :</label>
    <input type="checkbox" name="hobbies" id="movie1" value="movie"><label for="movie1">영화</label>
    <input type="checkbox" name="hobbies" id="music1" value="music"><label for="music1">음악</label>
    <input type="checkbox" name="hobbies" id="sleep1" value="sleep"><label for="sleep1">취침</label>
    <br>
    <input type="submit" value="Post 요청">
    <h4>a 태그의 href 속성에 파라미터를 쿼리스트링 형태로 작성하여 post 방식 요청</h4>
</form>
</body>
</html>