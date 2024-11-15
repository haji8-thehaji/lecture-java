package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.polytechnics.demo.refrigerator.model.ref.Recipe;
import com.polytechnics.demo.refrigerator.service.ref.RecipeService;


@Controller
public class RecipeController {
	@Autowired
	RecipeService recipeService;

	@GetMapping("/recipe")
	public String getRecipe(Model model) {
		List<Recipe> recipeList = recipeService.getAllRecipes();
		model.addAttribute("recipeList", recipeList);
		// System.out.println(recipeList);
        return "refrigerator/recipe";
	}
	// @GetMapping("/deleteRecipe/{id}")
    // @ResponseBody
	// public String deleteRecipe(Model model, @PathVariable Integer id) {
	// 	recipeService.deleteRecipe(id);
	// 	List<Recipe> recipeList = recipeService.getAllRecipes();
	// 	model.addAttribute("recipeList", recipeList);
	// 	// System.out.println(recipeList);
    //     return "refrigerator/recipe";
	// }
	
    @DeleteMapping("/deleteRecipe/{id}")
    public String deleteRecipe(@PathVariable("id") int id){
        System.out.println("id = " + id);
        recipeService.deleteRecipe(id);
        return "redirect:/recipe";
    }
	
}