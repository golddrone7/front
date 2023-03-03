package com.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;

/**
 * Servlet implementation class EmpListServlet
 */
@WebServlet(name = "List", urlPatterns = { "/list" })
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpBiz biz = new EmpBiz();
		ArrayList<EmpEntity> list = biz.listEmp();
		
		if(list!=null) {
			//System.out.println("ok list");
			// sendRedirect : C <-> S  * 2
			// RequestDispatcher : C <-> S 결과를 만들어서 한번에 보냄
			RequestDispatcher rd =
					request.getRequestDispatcher("emptest/empList.jsp");
			request.setAttribute("emp", list); // 리퀘스트명 emp
			rd.forward(request, response); //empList.jsp에 권한 위임
			
		}
	}
}
