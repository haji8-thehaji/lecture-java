package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;
import com.polytechnics.demo.refrigerator.service.ref.FoodInventoryService;

@Controller
public class ExpireController {
	@Autowired
	FoodInventoryService expireService;

	@GetMapping("/expire")
	public String showProducts2(Model model, @PathVariable("food_info_id") int food_info_id) {
		List<FoodInventory> expireList = expireService.getAllFoodInventoryByInfoId(food_info_id);
		model.addAttribute("FoodInventorys", expireList);
		// Object[] expireList2 = expireService.getFoodInventory(food_info_id);
		// model.addAttribute("FoodInventorys2", expireList);
		// System.out.println(Arrays.deepToString(expireList2));
		return "refrigerator/shop";

	}

	@DeleteMapping("/deleteExpire/{id}")
	public String deleteExpire(@PathVariable("id") int id) {
		System.out.println("id = " + id);
		expireService.deleteFoodInventory(id); // Expire 삭제
		return "redirect:/expire"; // 삭제 후 리다이렉트
	}
}
