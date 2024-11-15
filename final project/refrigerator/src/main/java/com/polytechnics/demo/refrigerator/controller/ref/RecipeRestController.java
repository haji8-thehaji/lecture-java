package com.polytechnics.demo.refrigerator.controller.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnics.demo.refrigerator.service.ref.RecipeService;


@RestController
public class RecipeRestController {
	@Autowired
	RecipeService recipeService;

	// @DeleteMapping("/deleteRecipe/{id}")
    // @ResponseBody
	// public void deleteRecipe(@PathVariable Integer id) {
	// 	recipeService.deleteRecipe(id);
	// }
	
}