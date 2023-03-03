package com.book.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.biz.BookBiz;
import com.book.entity.BookEntity;

@WebServlet(name = "INPUT", urlPatterns = { "/input" })
public class InputBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		BookEntity entity = new BookEntity();
		entity.setTitle(request.getParameter("title"));
		entity.setPrice(Integer.parseInt(request.getParameter("price")));
		entity.setIsbn(request.getParameter("isbn"));
		entity.setCompany(request.getParameter("company"));
		entity.setAuthor(request.getParameter("author"));
		
		BookBiz biz = new BookBiz();
		boolean isBook = biz.bookInsert(entity);
		
		if(isBook)
			response.sendRedirect("list");
		else
			response.sendRedirect("list");
	}

}
