package com.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;
@WebServlet(name = "Update2", urlPatterns = { "/update2" })
public class EmpUpdateServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		EmpEntity entity = new EmpEntity();
		entity.setEno(Integer.parseInt(request.getParameter("eno")));
		entity.setPhone(request.getParameter("phone"));
		entity.setDept(request.getParameter("dept"));
		
		EmpBiz biz = new EmpBiz();
		int n = biz.updateEmp2(entity);
		
		
		if(n>0)
			response.sendRedirect("list");
		else
			response.sendRedirect("emptest/empUpdate.jsp");
	
	}

}
