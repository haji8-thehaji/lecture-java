package com.haji.demo.thymeleaf_test.model;

public class Book {
	private String bookId;
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String bookId, String title, String author) {
		this.setBookId(bookId);
		this.setTitle(title);
		this.setAuthor(author);
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
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

	@Override
	public String toString() {
		return "bookId:" + bookId + ",title:" + title + ",author:" + author;
	}
}