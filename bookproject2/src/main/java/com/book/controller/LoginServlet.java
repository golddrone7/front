package com.book.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.book.biz.LoginBiz;
import com.book.dto.LoginDTO;

@WebServlet(name = "LOGIN", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		LoginBiz biz = new LoginBiz();
		boolean isLogin = biz.getLoginUser(id, password);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginOK", id);
			response.sendRedirect("/book1/login/loginOk.jsp");
		} else
			response.sendRedirect("/book1/login/fail.jsp");
	}
}
