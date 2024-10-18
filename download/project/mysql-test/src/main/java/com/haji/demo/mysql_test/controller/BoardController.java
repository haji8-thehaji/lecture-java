package com.haji.demo.mysql_test.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haji.demo.mysql_test.model.Board;
import com.haji.demo.mysql_test.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;

	@GetMapping("/board")
	public String member_haji(Model model) {
		List<Board> boardList = boardService.getAllBoardHajis();
		model.addAttribute("boardList", boardList);
		System.out.println(boardList);
        return "board";
	}

}