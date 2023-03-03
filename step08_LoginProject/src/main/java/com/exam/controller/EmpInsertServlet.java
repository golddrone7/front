package com.exam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;

@WebServlet(name = "Insert", urlPatterns = { "/insert" })
public class EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		문제. empInsert.jsp에서 넘어온 데이터를 EmpEntity 객체를 만들어서 
//		저장하고 biz.insertEmp(emp)를 호출하세요
		
		String ename = request.getParameter("ename");
		String phone = request.getParameter("phone");
		String dept = request.getParameter("dept");
		
		EmpEntity emp = new EmpEntity(ename, phone, dept);
//		entity.setEname(ename);
//		entity.setPhone(phone);
//		entity.setDept(dept);
		
		EmpBiz biz = new EmpBiz();
		int n = biz.insertEmp(emp);
		
		if(n>0)
			response.sendRedirect("list");
		else
			response.sendRedirect("/log/emptest/empInsert.jsp");
			
	}
}
