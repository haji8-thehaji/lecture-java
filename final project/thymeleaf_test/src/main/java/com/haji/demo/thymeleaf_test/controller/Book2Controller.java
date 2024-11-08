package com.haji.demo.thymeleaf_test.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.haji.demo.thymeleaf_test.model.Book2;
import com.haji.demo.thymeleaf_test.service.Book2Service;

@Controller
public class Book2Controller {
	
	private Book2Service book2Service;
	
	public Book2Controller(Book2Service book2Service) {
		this.book2Service = book2Service;
	}
	
	@GetMapping("/")
	public String index(Model model) {
		List<Book2> books = book2Service.getAllBooks();
		model.addAttribute("allBooks", books);
		return "index";
	}
	
	@GetMapping("/listBook")
	public String viewBookList(Model model) {
		List<Book2> books = book2Service.getAllBooks();
		model.addAttribute("allBooks", books);
		
		return "listBook";
	}
	
	@GetMapping("/viewBook/{id}")
	public String viewBook(@PathVariable("id") String id, Model model) {
		Book2 book2 = book2Service.getBookById(id);
		model.addAttribute("book", book2);
		
		return "viewBook";
	}
	
	@GetMapping("/addViewBook")
	public String addViewBook() {
		return "addViewBook";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book2 book2) {
		book2Service.saveBook(book2);
		
		return "redirect:/listBook";
	}
	
	@GetMapping("/updateViewBook/{id}")
	public String updateViewBook(@PathVariable("id") String id, Model model) {
		Book2 book2 = book2Service.getBookById(id);
		model.addAttribute("book", book2);
		
		return "updateViewBook";
	}
	
	@PostMapping("/updateBook/{id}")
	public String updateBook(@PathVariable("id") String id, @ModelAttribute Book2 book) {
		book2Service.updateBook(book);
		
		return "redirect:/listBook";
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id") String id) {
		book2Service.deleteBook(id);
		
		return "redirect:/listBook";
	}

}