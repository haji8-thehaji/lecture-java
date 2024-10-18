package com.haji.demo.thymeleaf_test.controller.haji;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haji.demo.thymeleaf_test.model.haji.BoardHaji;
import com.haji.demo.thymeleaf_test.service.haji.BoardHajiService;

@Controller
// @GetMapping("/haji")
public class BoardHajiController {
	@Autowired
	BoardHajiService boardHajiService;

	@GetMapping("/haji")
	public String member_haji(Model model) {
		List<BoardHaji> boardHajiList = boardHajiService.selectSampleList();
		model.addAttribute("boardHAjiList", boardHajiList);
		
        return "haji/board/main_haji";
	}

}