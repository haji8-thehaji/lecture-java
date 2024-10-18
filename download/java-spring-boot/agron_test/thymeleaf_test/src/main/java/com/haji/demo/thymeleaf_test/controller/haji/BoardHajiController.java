package com.haji.demo.thymeleaf_test.controller.haji;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @GetMapping("/haji")
public class BoardHajiController {
	
	@GetMapping("/haji")
	public String member_haji(Model model) {
        return "haji/board/main_haji";
	}

}