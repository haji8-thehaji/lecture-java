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
	
	@GetMapping("/m1")
	public String member_haji(Model model) {
        return "member/main_haji";
	}
	@GetMapping("/m2")
	public String member_choi(Model model) {
        return "member/main_choi";
	}
	@GetMapping("/m3")
	public String member_boram(Model model) {
        return "member/main_boram";
	}
	@GetMapping("/m4")
	public String member_2710(Model model) {
        return "member/main_2710";
	}

}