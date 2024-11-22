package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;
import com.polytechnics.demo.refrigerator.service.ref.FoodInventoryService;

@Controller
public class JmgController {
	@Autowired
	FoodInventoryService foodInventoryService;

	@GetMapping("/jmg")
	public String getFoodInventory(Model model) {
		List<FoodInventory> foodInventoriesList = foodInventoryService.getAllFoodInventory();
		model.addAttribute("jmg", foodInventoriesList);
		return "refrigerator/jmg";
	}

	@DeleteMapping("/deleteFoodInventory/{id}")
	public String deleteFoodInventory(@PathVariable("id") int id) {
		System.out.println("id = " + id);
		foodInventoryService.deleteFoodInventory(id);
		return "redirect:/jmg";
	}

}