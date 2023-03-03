package com.book.biz;

import java.util.ArrayList;

import com.book.dao.BookDAO;
import com.book.dto.BookDTO;

public class BookBiz {

	public ArrayList<BookDTO> getBookList() {
		BookDAO dao = new BookDAO();
		ArrayList<BookDTO> list = dao.getBookList();
		
		return list;
	}

	public boolean bookInsert(BookDTO entity) {
		BookDAO dao = new BookDAO();
		boolean isBook = dao.bookInsert(entity);
		
		return isBook;
	}

}
