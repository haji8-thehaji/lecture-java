package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.polytechnics.demo.refrigerator.service.ref.RecipeService;
import com.polytechnics.demo.refrigerator.model.ref.Recipe;


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