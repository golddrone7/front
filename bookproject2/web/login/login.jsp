<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<form method="post" action="../login">
<table border="0px" width="350px" align="center">
  <tr>
    <td>아이디</td>
    <td><input type="text" name="id" placeholder="아이디를 입력하세요"></td>
  </tr>
  <tr>
    <td>비밀번호</td>
    <td><input type="text" name="password" placeholder="비밀번호를 입력하세요"></td>
  </tr>
  <tr>
  	<td colspan="2" align="center">
		<input type="submit" value="로그인">
		<input type="reset" value="취&nbsp;&nbsp;소">   	
  	</td>
  </tr>
  
</table>

</form>


</body>
</html>