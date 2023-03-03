package com.book.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.book.biz.LoginBiz;
import com.book.entity.LoginEntity;

@WebServlet(name = "LOGIN", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		LoginEntity entity = new LoginEntity();
		entity.setUserid(request.getParameter("id"));
		entity.setUserpwd(request.getParameter("password"));
		
		LoginBiz biz = new LoginBiz();
		boolean isLogin = biz.getLoginUser(entity);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("logOK", entity);
			response.sendRedirect("/book/login/loginOk.jsp");
		}else {
			response.sendRedirect("/book/login/fail.jsp");
		}
		
		
	}

}
