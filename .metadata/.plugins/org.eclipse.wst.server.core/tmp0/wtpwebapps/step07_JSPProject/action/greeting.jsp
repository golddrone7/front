<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	if(request.getParameter("country").equals("korea")){
%>
		감사합니다 뭘 이런걸 다!	
<%		
	} else if(request.getParameter("country").equals("japan")){
%>		
		ありがとうございます。
<% 
}
	else{
%>		
		谢谢你所做的一切！
<% 
}
%>