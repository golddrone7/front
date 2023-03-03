package com.book.biz;

import java.util.ArrayList;

import com.book.dao.BookDao;
import com.book.dto.BookDTO;
import com.book.entity.BookEntity;

public class BookBiz {

	public ArrayList<BookDTO> getBookList() {
		BookDao dao = new BookDao();
		ArrayList<BookDTO> list = dao.getBookList();
		return list;
	}

	public boolean bookInsert(BookEntity entity) {
		
		BookDao dao = new BookDao();
		boolean isBook = dao.bookInsert(entity);
		return isBook;
	}

}
