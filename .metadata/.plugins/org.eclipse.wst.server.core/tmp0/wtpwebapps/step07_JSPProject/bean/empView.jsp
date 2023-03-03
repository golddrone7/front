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
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="ob" class="bean.EmpVo"/>
<jsp:setProperty property="*" name="ob"/> <!-- 19~21 -->


<!-- 서버에서 동작하는 자바 객체 생성 
import bean.EmpVo;

EmpVo ob=new EmpVo();
ob.setName(request.getParameter("name");
ob.setPhone(request.getParameter("phone");
ob.setAddr(request.getParameter("addr");
 -->

이름 : <jsp:getProperty property="name" name="ob"/>
전화 : <jsp:getProperty property="phone" name="ob"/>
주소 : <jsp:getProperty property="addr" name="ob"/>




<!-- 
PrintWriter out = response.getWriter(); <== 웹으로 내보내기 위해
out.print("이름 : " + ob.getName());
out.print("전화 : " + ob.getPhone());
out.print("주소 : " + ob.getAddr());
 -->
<br><br>

	이름 : <%=ob.getName()%>
	전화 : <%=ob.getPhone()%>
	주소 : <%=ob.getAddr()%>
	
	



</body>
</html>