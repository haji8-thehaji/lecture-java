package com.haji.demo.thymeleaf_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	// @GetMapping("/test")
	// public String index() {
    //     return "index.html";
	// }
	
	@GetMapping("/test2")
	public String member_haji(Model model) {
        return "member/main_haji";
	}

}