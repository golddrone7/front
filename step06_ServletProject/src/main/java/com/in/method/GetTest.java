package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "get.do", urlPatterns = { "/get.do" })
public class GetTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리 (utf-8, euc-kr)
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		//2. 데이터 가져오기
		String name = request.getParameter("irum");
		String pwd = request.getParameter("amho");
		
		
		//3. 결과 출력
		out.print("<html>");
		out.print("<head>");

		out.print("<title>");
		out.print("처음으로 만들어 보는 서블릿");
		out.print("</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>Get Test</h3>");
		out.print("이름 : " + name + "<br>");
		out.print("암호 : " + pwd + "<br>");
		
		out.print("<a href='/servlet/test/getTest.html'>처음화면</a>");
		out.print("<h1>getTest</h1><br>");
		out.print("<div style='border:1px solid red;'>123 </div> ");
		
		out.print("</body>");
	
		out.print("</html>");
	}




}
