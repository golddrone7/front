package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.LoginBiz;

@WebServlet(name = "LOGIN", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid=request.getParameter("userid");
		String userpwd=request.getParameter("userpwd");
		//System.out.println(userid+ " " + userpwd);
		
		LoginBiz biz = new LoginBiz();
		boolean b = biz.getLoginUser(userid, userpwd);
		
		
		
		
		
	}

}
