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
	double bottom = Integer.parseInt(request.getParameter("bottom"));
	double height = Integer.parseInt(request.getParameter("height"));
%>

삼각형의 넓이 : <%= bottom*height/2 %>


</body>
</html>