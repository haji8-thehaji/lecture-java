package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

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
		List<Memo> memoList = memoService.getAllRecipes();
		model.addAttribute("memo", memoList.get(0));
		//System.out.println(memoList);
        List<Recipe> recipeList = recipeService.getAllRecipes();
		model.addAttribute("recipe", recipeList.get(0));
		// System.out.println(recipeList);
        return "ref_main";
    }
}
