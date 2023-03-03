<%@page import="java.util.List"%>
<%@page import="com.exam.entity.EmpEntity"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<% 
	List<EmpEntity> list= (List<EmpEntity>)request.getAttribute("emp");
	if(list!=null){
%>
	<table border="1" align="center" width="500px">
	<tr>
		<td>사원번호</td>
		<td>사원이름</td>
		<td>전화번호</td>
		<td>부서</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
<%

	for(EmpEntity ob:list){
%>	
	<tr>
		<td><%= ob.getEno() %></td>
		<td><%= ob.getEname() %></td>
		<td><%= ob.getPhone() %></td>
		<td><%= ob.getDept() %></td>
		<td>
		<form action="emptest/empUpdate.jsp" method="post">
			<input type="hidden" name="eno" value="<%= ob.getEno() %>">
			<input type="hidden" name="ename" value="<%= ob.getEname() %>">
			<input type="hidden" name="ephone" value="<%= ob.getPhone() %>">
			<input type="hidden" name="edept" value="<%= ob.getDept() %>">
			<input type="submit" value="수정" >
		</form>
		</td>
		<td>
			<form action="/log/delete" method="post">
			<input type="hidden" name="eno" value="<%=ob.getEno()%>">
			<input type="submit" value="삭제" onclick="return confirm('삭제하시겠습니까?')"> 
			</form>
		</td>
		<%-- 
		<td>
			<form action="emptest/empDelete.jsp" method="post">
			<input type="hidden" name="eno" value="<%= ob.getEno() %>">
			<input type="hidden" name="ename" value="<%= ob.getEname() %>">
			<input type="hidden" name="ephone" value="<%= ob.getPhone() %>">
			<input type="hidden" name="edept" value="<%= ob.getDept() %>">
			<input type="submit" value="삭제">
		</form>
		</td>
		 --%>
	</tr>
<%
	} //end of for
%>		
	</table>
<%
}
%>


</body>
</html>