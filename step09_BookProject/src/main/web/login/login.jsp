<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>
<form action="/book2/login" method="post">
	<table border="0" align="center" width="350">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="text" name="userpwd"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
				
			</td>
		</tr>
	
	</table>



</form>


</body>
</html>