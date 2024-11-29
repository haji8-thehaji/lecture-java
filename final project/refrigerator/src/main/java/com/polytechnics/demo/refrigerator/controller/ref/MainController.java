package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.polytechnics.demo.refrigerator.model.ref.Memo;
import com.polytechnics.demo.refrigerator.model.ref.Recipe;
import com.polytechnics.demo.refrigerator.service.ref.MainService;
import com.polytechnics.demo.refrigerator.service.ref.MemoService;
import com.polytechnics.demo.refrigerator.service.ref.RecipeService;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;
	@Autowired
	MemoService memoService;
    @Autowired
	RecipeService recipeService;

    @GetMapping("/main")
    public String showMainPage(Model model) {
        // User user = mainService.getUserByName("홍길동");
        // model.addAttribute("userName", user.getUserName());
		List<Memo> memoList = memoService.getAllMemos();
        model.addAttribute("memoList", memoList);
		//System.out.println(memoList);
        Optional<Recipe> recipeOptional = mainService.getRandomRecipe();

        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            List<String> steps = mainService.getSteps(recipe.getSteps()); // steps 가공
            model.addAttribute("recipe", recipe);
            model.addAttribute("steps", steps);
        } else {
            model.addAttribute("error", "No recipe found");
        }

        return "ref_main";
    }
}
