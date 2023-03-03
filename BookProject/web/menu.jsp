<%@page import="com.book.entity.LoginEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body { margin: 0; padding: 0;}
	.header{
		height: 100px;
		background-color: skyblue;
	}
	
	a{text-decoration: none; display: inline-block; margin-top: 40px; 
	font: bold; width:100px; text-align: center;}
	p{color: limegreen; font-weight: bold; font-size: 30px;}
	
</style>
</head>
<body>

<div class="header">
	<a href="/book/index.jsp">처음화면</a>
	<%
		LoginEntity entity = (LoginEntity)session.getAttribute("logOK");
		if(entity==null){
		%>
		<a href="/book/login/login.jsp">로그인화면</a>					
	<% 		
		} else {
	%>
		<a href="<%=application.getContextPath() %>/book/bookInput.jsp">도서등록</a>	
		<a href="<%=application.getContextPath() %>/list">도서목록</a>	
		<a href="<%=application.getContextPath() %>/logout">로그아웃</a>	
		<span style="font-size:14px;">
		<b><%=entity.getUserid() %></b>님이 로그인 하셨습니다.
		</span>
	<%
		}
	%>

</div>


