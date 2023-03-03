package com.book.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.biz.BookBiz;
import com.book.dto.BookDTO;
import com.book.entity.BookEntity;

/**
 * Servlet implementation class ListBookServlet
 */
@WebServlet(name = "LIST", urlPatterns = { "/list" })
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		BookBiz biz = new BookBiz();
		ArrayList<BookDTO> list = new ArrayList<>();
		list = biz.getBookList();
		
		if(list==null) {
			response.sendRedirect("/book/index.jsp");
		} else {
			RequestDispatcher rd = 
					request.getRequestDispatcher("/book/bookList.jsp");
			request.setAttribute("book", list);
			rd.forward(request, response);
		}
	}
}
