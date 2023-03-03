package com.in.exam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "hello.do", urlPatterns = { "/hello.do" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		response.getWriter().print("<html>");
		response.getWriter().print("<head>");

		response.getWriter().print("<title>");
		response.getWriter().print("처음으로 만들어 보는 서블릿");
		response.getWriter().print("</title>");
		response.getWriter().print("</head>");
		response.getWriter().print("<body>");
		response.getWriter().print("<h1>안녕하세요</h1><br>");
		response.getWriter().print("<div style='border:1px solid red;'>123 </div> ");
		response.getWriter().print("넥스트 서블릿<br> ");
		response.getWriter().print("<a href='next.do'>다음으로</a> ");
		
		response.getWriter().print("</body>");
	
		response.getWriter().print("</html>");
	}

}
