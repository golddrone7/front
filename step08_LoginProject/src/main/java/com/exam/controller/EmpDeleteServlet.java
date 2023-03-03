package com.exam.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.biz.EmpBiz;
import com.exam.entity.EmpEntity;

@WebServlet(name = "Delete", urlPatterns = { "/delete" })
public class EmpDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		EmpEntity entity = new EmpEntity();
		entity.setEno(Integer.parseInt(request.getParameter("eno")));
		EmpBiz biz = new EmpBiz();
		int n = biz.deleteEmp(entity);
		response.sendRedirect("list");
	}
}
