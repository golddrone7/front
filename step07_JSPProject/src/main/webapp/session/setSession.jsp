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
	String strId1="apple";
	String strId2="orange";
	
	//세션 설정
	session.setAttribute("logId1", strId1);
	session.setAttribute("logId2", strId2);
	
	
%>

세션에 속성을 설정했습니다<br>
<a href="viewSession1.jsp">세션 정보 확인</a>


</body>
</html>
<!--  
	session
	웹사이트의 여러 페이지에서 사용되는 사용자 정보(문자열, 객체, 값)를 저장하는 방법
	
	쿠키는 클라이언트의 컴퓨터에 모든 데이터를 저장
	세션은 서버쪽에 데이터를 저장, 세션의 키를 클라이언트측에 기록
	

-->