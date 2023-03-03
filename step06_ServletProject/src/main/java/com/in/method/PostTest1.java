package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "post1.do", urlPatterns = { "/post1.do" })
public class PostTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리 (utf-8)
		// 클라이언트로 부터 전송받은 데이터 한글처리(post에만 사용)
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8"); // 클라이언트로 부터 전송받은 데이터 한글처리
		
		//2. 데이터 가져오기
		String name = request.getParameter("irum");
		String pwd = request.getParameter("amho");
		
		
		//3. 출력
		out.print("<html><head><title>postTest</title></head>");
		out.print("<body>");
		out.print("<h3>Post Test</h3>");
		out.print("이름 : " + name + "<br>");
		out.print("비밀번호 : " + pwd + "<br>");
		
		out.print("<a href='/servlet/test/postTest1.html' >처음화면</a>");
		out.print("</body></html>");
		
		
	}
}
