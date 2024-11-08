package com.haji.demo.thymeleaf_test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.haji.demo.thymeleaf_test.model.Lemp;
import com.haji.demo.thymeleaf_test.service.LempService;

@Controller
public class LempController {
	@Autowired
	private LempService lempService;
	
	
	@GetMapping("/listLemp")
	public String viewLempList(Model model) {
		List<Lemp> lemps = lempService.getAllLemps();
		model.addAttribute("allLemps", lemps);
		
		return "listLemp";
	}
	
	@GetMapping("/viewLemp/{id}")
	public String viewLemp(@PathVariable("id") String id, Model model) {
		Lemp lemp = lempService.getLempById(id);
		model.addAttribute("lemp", lemp);
		
		return "viewLemp";
	}
	
	@GetMapping("/addViewLemp")
	public String addViewLemp() {
		return "addViewLemp";
	}
	
	@PostMapping("/addLemp")
	public String addLemp(@ModelAttribute Lemp lemp) {
		lempService.saveLemp(lemp);
		
		return "redirect:/listLemp";
	}
	
	@GetMapping("/updateViewLemp/{id}")
	public String updateViewLemp(@PathVariable("id") String id, Model model) {
		Lemp lemp = lempService.getLempById(id);
		model.addAttribute("lemp", lemp);
		
		return "updateViewLemp";
	}
	
	@PostMapping("/updateLemp/{id}")
	public String updateLemp(@PathVariable("id") String id, @ModelAttribute Lemp lemp) {
		lempService.updateLemp(lemp);
		
		return "redirect:/listLemp";
	}
	
	@GetMapping("/deleteLemp/{id}")
	public String deleteLemp(@PathVariable("id") String id) {
		lempService.deleteLemp(id);
		
		return "redirect:/listLemp";
	}

}