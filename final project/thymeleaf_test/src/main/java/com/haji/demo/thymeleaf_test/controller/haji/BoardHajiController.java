package com.boram.demo.thymeleaf_test.controller.boram;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haji.demo.thymeleaf_test.model.haji.BoardHaji;
import com.haji.demo.thymeleaf_test.service.haji.BoardHajiService;

@Controller
// @GetMapping("/boram")
public class BoardHajiController {
	@Autowired
	BoardHajiService boardHajiService;

	@GetMapping("/boram")
	public String member_haji(Model model) {
		List<BoardHaji> boardHajiList = boardHajiService.getAllBoardHajis();
		model.addAttribute("boardHajiList", boardHajiList);
		System.out.println(boardHajiList);
        return "boram/board/main_boram";
	}

}