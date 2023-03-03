package com.exam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;

@WebServlet(name = "Update", urlPatterns = { "/update" })
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		EmpEntity entity = new EmpEntity();
		entity.setEno(Integer.parseInt(request.getParameter("eno")));
		entity.setEname(request.getParameter("ename"));
		entity.setPhone(request.getParameter("phone"));
		entity.setDept(request.getParameter("dept"));
		
		EmpBiz biz = new EmpBiz();
		int n = biz.updateEmp(entity);
		response.sendRedirect("list");
	}
}
