package com.haji.demo.thymeleaf_test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haji.demo.thymeleaf_test.model.Isagaroot.Isaga;
import com.haji.demo.thymeleaf_test.service.IsagaService;

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

	
	@GetMapping("/m5")
	public String member_isaga(Model model) {
        return "member/isaga";
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
	@GetMapping("/m6")
	public String member_jmg(Model model) {
        return "member/main_jmg";
	}
	@Autowired
	IsagaService isagaService;
	@RequestMapping(value="/sample/isaga")
	public String selectSampleList(Model model) {
	List<Isaga> sampleList = isagaService.getAllIsagas(); 
	model.addAttribute("resultList", sampleList);

	return "/member/isaga";
 }	 

}