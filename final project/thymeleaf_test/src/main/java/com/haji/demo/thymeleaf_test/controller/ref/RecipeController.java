package com.haji.demo.thymeleaf_test.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haji.demo.thymeleaf_test.model.ref.Recipe;
import com.haji.demo.thymeleaf_test.service.ref.RecipeService;


@Controller
// @GetMapping("/haji")
public class RecipeController {
	@Autowired
	RecipeService recipeService;

	@GetMapping("/ref")
	public String member_haji(Model model) {
		List<Recipe> recipeList = recipeService.getAllRecipes();
		model.addAttribute("recipeList", recipeList);
		System.out.println(recipeList);
        return "haji/board/recipe_haji";
	}

}