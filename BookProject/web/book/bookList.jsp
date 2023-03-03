<%@page import="java.text.NumberFormat"%>
<%@page import="javax.swing.text.NumberFormatter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.book.entity.BookEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../menu.jsp" %>

<%
	ArrayList<BookEntity> bookList = (ArrayList<BookEntity>)request.getAttribute("book");
%>
<div align="center">
<div style="font-size: 20px; margin-top: 30px; margin-bottom: 30px;" >
	<b>도서전체확인</b>
</div>
	<div>
	<table border="1" width="800">
		<tr>
			<td>도서코드</td>
			<td>책이름</td>
			<td>저자</td>
			<td>출판사</td>
			<td>가격</td>
		</tr>
	<%	
		for(BookEntity book : bookList){
	%>		
		<tr>
			<td><%=book.getIsbn() %></td>
			<td><%=book.getTitle() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getCompany() %></td>
			<% 
			NumberFormat formatter = NumberFormat.getNumberInstance();
			%>
			<td><%=formatter.format(book.getPrice())%>원</td>		
		</tr>
		
	<% 		
		}
	%>
	</table>
	</div>
	<div style="height: 50px;"></div>
	<div><a href="/book/book/bookInput.jsp">[도서등록]</a></div>
</div>


</body>
</html>