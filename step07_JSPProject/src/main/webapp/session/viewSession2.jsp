<%@page import="java.util.Enumeration"%>
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
	Enumeration ob= session.getAttributeNames();
	while(ob.hasMoreElements()){
		String name=(String)ob.nextElement();	// logId1, logId2
		String value=(String)session.getAttribute(name);	
%>
		세션이름 : <%=name %><br>
		세션 값 : <%=value %><br>
		세션 ID : <%=session.getId() %><br>
<%	
	}
%>
</body>
</html>