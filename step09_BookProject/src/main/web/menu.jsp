<%@page import="dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	p {color: limegreen; font-weight: bold;}
	body{margin:0; padding: 0;}
	
	#menu{height: 100px; background-color: skyblue;}
	a{text-decoration: none; display: inline-block;
	margin-top: 40px; text-align: center; font: bold; widows: 100px;}
	#login_info{font-size: 12px}
</style>
</head>
<body>
<div id="menu">
	<%
		LoginDTO entity = (LoginDTO)session.getAttribute("logOK");
	/* 	세션 : 클라이언트에서 취득한 정보를 서버에 저장
		연결된 상태 확인 
		 톰켓(웹서버)
		 컨테이너
		  세션	
	 세션 객체 : 웹 브라우저와 하나씩 연결한다.
		  
	|톰켓 | 컨테이너 |	세션 | 객체|	|		|		|
		getAttribute 세션이 살아있으면 연결, 죽었으면 끊김
		
		세션이 입맛대로 동작하지 않음
		ㄴ 탭을 사용하기 때문에 
		뱅킹 사이트면 열렸던 페이지가 닫히면 세션이 닫혀야함
		
		네이버 로그인 유지(체킹) 
		
		getAttribute는 Object를 반환하니 적절한 형변환이 필요
		 */
		 
		 if(entity==null){
			 %>
			<a href="/book2/index.jsp">처음화면</a>
			<a href="/book2/login/login.jsp">로그인화면</a>
			
			 
		 <% 
		 }
		 %>
		 
		 



</div>


