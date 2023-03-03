package com.in.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "post2.do", urlPatterns = { "/post2.do" })
public class PostTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 한글처리 utf-8
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//2. 데이터 불러오기, 계산
		int score=0;
		String name = request.getParameter("irum");
		try {
			score = Integer.parseInt(request.getParameter("jumsu"));
		} catch(NumberFormatException e) {
			out.print("<html><head><title>에러!!</title></head>");
			out.print("<body><h3>숫자 변환 오류페이지입니다!!</h3></body></html>");
			return;
		}
		String result="";
		
		if(score>=60)
			result="합격";
		else
			result="불합격";
		
		
		//3. 출력
		
		out.print("<html><head><title>점수 계산기</title></head>");
		out.print("<body>");
		out.print("<h3>Post Test2</h3>");
		out.print("<div>이름 : "+ name +"</div>");
		out.print("<div>점수 : "+ score +"</div>");
		out.print("<div>결과 : "+ result +"</div><br>");
		out.print("<a href='/servlet/test/postTest2.html'>처음화면</a>");
		out.print("</body></html>");
		
	}

}
