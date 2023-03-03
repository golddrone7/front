<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	align-content: center;
}
.top {
	background-color: skyblue;
	height: 100px;
	padding-top: 60px;
	font-size: 20px;
}
span{
	margin-left: 30px;
}
a {
	text-decoration: none;
}

p {
	font-size: 30px;
	color: limegreen;
}
</style>

</head>
<body>
<% request.setCharacterEncoding("utf-8");
	String id = null;
	id = (String)session.getAttribute("loginOK");
%>
<div class="top">

	<span><a href="/book1/index.jsp">처음화면</a></span>
<%if(id==null) {%>
	<span><a href="/book1/login/login.jsp">로그인화면</a></span>
<%} else {%>
	<span><a href="/book1/book/bookInput.jsp">도서등록</a></span>
	<span><a href="/book1/list">도서목록</a></span>
	<span><a href="/book1/logout">로그아웃</a></span>
	<span style="font-size: 12px;"><b><%=id %>님이 로그인 하셨습니다</b></span>
<% } %>
</div>


