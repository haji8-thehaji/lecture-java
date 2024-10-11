package com.haji.demo.thymeleaf_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haji.demo.thymeleaf_test.model.Book;
import com.haji.demo.thymeleaf_test.model.Lemp;
import com.haji.demo.thymeleaf_test.service.BookService;
import com.haji.demo.thymeleaf_test.service.LempService;

@Controller
public class TestController {

    @Autowired
	private BookService bookService;
    
    @Autowired
	private LempService lempService;
    
	// @GetMapping("/test")
	// public String index() {
    //     return "index.html";
	// }
	
	@GetMapping("/test")
	public String viewBookList(Model model) {
		List<Book> books = bookService.getAllBooks();
		model.addAttribute("allBooks", books);
		
		List<Lemp> lemps = lempService.getAllLemps();
		model.addAttribute("allLemps", lemps);
		
        return "index";
	}

}