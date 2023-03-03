<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<form action="../update" method="post">
<table border="1" align="center" width="500px">
	<tr>
		<td>사원번호</td>
		<td><input type="text" name="eno" value="<%=request.getParameter("eno") %>" readonly></td>
	</tr>
	<tr>
		<td>사원이름</td>
		<td><input type="text" name="ename" value="<%=request.getParameter("ename") %>" readonly></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="phone" value="<%=request.getParameter("ephone") %>"></td>
	</tr>
	<tr>
		<td>부서</td>
		<td><input type="text" name="dept" value="<%=request.getParameter("edept") %>"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="수정하기">
			<input type="button" value="취소하기" onclick="history.go(-1)">
		</td>
	</tr>
</table>
	
	
	
</form>

</body>
</html>