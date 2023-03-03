<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str="hello";
%>
<!-- 주석 처리 부분입니다 '소스보기'에 보임-->

<%-- 
	jsp 주석
	jsp파일에서만 보이고 '소스보기'에서 나타나지 않아요
	브라우저 쪽으로 내보내지 않는 문장
--%>
 
 	<!--  <%= str %> 주석 안에서 보이는 변수 -->
	<%= str /* 표현식 안에서 주석 처리가 가능 */ %>
</body>
</html>