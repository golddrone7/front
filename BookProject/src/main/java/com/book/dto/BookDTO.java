package com.book.dto;

/*
	ISBN VARCHAR2(15) PRIMARY KEY,
	TITLE VARCHAR2(50) NOT NULL,
	AUTHOR VARCHAR2(10) NOT NULL,
	COMPANY VARCHAR2(50),
	PRICE NUMBER
*/
public class BookDTO {
	private String isbn;
	private String title;
	private String author;
	private String company;
	private int price;
	public BookDTO() {
	}
	public String getIsbn() {
		return isbn;
	}
	
	public BookDTO(String isbn, String title, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
