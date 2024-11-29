package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.service.ref.ExpireService;

@Controller
public class ExpireController {
	@Autowired
	ExpireService expireService;

	@GetMapping("/expire")
	public String getExpire(Model model) {
		List<FoodInfo> expireList = expireService.getAllExpire();
		model.addAttribute("expireList", expireList); // Expire 데이터 추가
		return "refrigerator/expire"; // 뷰 이름
	}

	@DeleteMapping("/deleteExpire/{id}")
	public String deleteExpire(@PathVariable("id") int id) {
		System.out.println("id = " + id);
		expireService.deleteExpire(id); // Expire 삭제
		return "redirect:/expire"; // 삭제 후 리다이렉트
	}
}
