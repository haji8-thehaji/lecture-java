package com.haji.demo.thymeleaf_test.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.Book2;
import com.haji.demo.thymeleaf_test.repository.BookRepository;

@Service
public class Book2Service {
	
	private final BookRepository bookRepository;
	public Book2Service(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    // @Autowired
	// private final BookRepository bookRepository;
	
	public List<Book2> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Book2 getBookById(String id) {
		Optional<Book2> book = bookRepository.findById(id);
		return book.get();
	}
	
	public void saveBook(Book2 book) {
		bookRepository.save(book);
	}
	
	public void updateBook(Book2 book) {
		bookRepository.save(book);
	}
	
	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}

}