<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
import bean.Testbean;

PrintWriter out = response.getWriter();
TestBean ob = new TestBean();
ob.setName("개나리");
ob.getName();
out.print("나의 이름은 " + ob.getName() +"입니다");
 -->


<!-- ob 변수이름 / class 경로, scope : Lifecycle -->
<!-- property 변수이름    name 객체 -->
<jsp:useBean id="ob" class="bean.TestBean" scope="page"></jsp:useBean>
<jsp:setProperty property="name" name="ob" value="개나리"/>
나의 이름은 <jsp:getProperty property="name" name="ob"/> 입니다.
<br>
<%
	ob.setName("진달래");
%>
너의 이름은 <%=ob.getName() %> 이야~


</body>
</html>