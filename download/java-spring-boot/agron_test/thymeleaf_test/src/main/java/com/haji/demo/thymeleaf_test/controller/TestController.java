package com.haji.demo.thymeleaf_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haji.demo.thymeleaf_test.model.Book;
import com.haji.demo.thymeleaf_test.service.BookService;

@Controller
public class TestController {

    @Autowired
	private BookService bookService;
    
	// @GetMapping("/test")
	// public String index() {
    //     return "index.html";
	// }
	
	@GetMapping("/test")
	public String viewBookList(Model model) {
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("allBooks", books);
        return "index";
	}

}