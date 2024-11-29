package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.polytechnics.demo.refrigerator.model.ref.FoodCategory;
import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.common.Food;
import com.polytechnics.demo.refrigerator.service.ref.FoodCategoryService;
import com.polytechnics.demo.refrigerator.service.ref.FoodInfoService;


@Controller
public class ShopController {

    @Autowired
    FoodInfoService foodInfoService;

    @Autowired
    FoodCategoryService foodCategoryService;


    @GetMapping("/shop/{food_category_id}")
    public String showProducts(Model model, @PathVariable("food_category_id") int food_category_id) {
        List<FoodInfo> foodInfos = foodInfoService.getAllFoodInfoByCategoryId(food_category_id);
        model.addAttribute("foodInfos", foodInfos);
        return "refrigerator/shop";
    }
    @GetMapping("/shop2/{food_category_id}")
    public String showProducts2(Model model, @PathVariable("food_category_id") int food_category_id) {
        // List<FoodInfo> foodInfos = foodInfoService.getAllFoodInfoByCategoryId(food_category_id);
        // model.addAttribute("foodInfos", foodInfos);


        List<FoodCategory> foodCategories = foodCategoryService.getAllFoodCetegorys();
        model.addAttribute("foodCategories", foodCategories);
        
        List<Food> foods = foodInfoService.getAllFoodByCategoryId(food_category_id);
        model.addAttribute("foods", foods);
        System.out.println(foods);
        model.addAttribute("selectedCategory", food_category_id);

        // System.out.println(Arrays.deepToString(foods));

        //List<FoodInfoDetail> foodInfoDetails = foodInfoService.getFoodInfo(food_category_id);
        //model.addAttribute("foodInfoDetails", foodInfoDetails);
        //System.out.println(foodInfoDetails);

        
        // List<TestDto> testDtos = foodInfoService.getTestInfo();
        // model.addAttribute("testDtos", testDtos);
        // System.out.println(testDtos);
        
        return "refrigerator/shop";
    }
}
