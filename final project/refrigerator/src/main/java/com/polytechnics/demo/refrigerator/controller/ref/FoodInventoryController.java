package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;
import com.polytechnics.demo.refrigerator.service.ref.FoodInventoryService;

@Controller
public class FoodInventoryController {
	@Autowired
	FoodInventoryService foodInventoryService;

	@GetMapping("/food")
	public String food(Model model) {
		List<FoodInventory> foodList = foodInventoryService.getAllFoodInventory();
		model.addAttribute("foodList", foodList);
		System.out.println(foodList);
		return "refrigerator/memo";
	}

}