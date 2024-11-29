package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.common.FoodInfoDetail;
import com.polytechnics.demo.refrigerator.service.ref.FoodInfoService;
import com.polytechnics.demo.refrigerator.service.ref.ShopService;

@Controller
public class ShopController {

    @Autowired
    ShopService shopService;

    @Autowired
    FoodInfoService foodInfoService;

    @GetMapping("/shop/{food_category_id}")
    public String showProducts(Model model, @PathVariable("food_category_id") int food_category_id) {
        List<FoodInfo> foodInfos = foodInfoService.getAllFoodInfoByCategoryId(food_category_id);
        model.addAttribute("foodInfos", foodInfos);
        return "refrigerator/shop";
    }
    @GetMapping("/shop2/{food_category_id}")
    public String showProducts2(Model model, @PathVariable("food_category_id") int food_category_id) {
        List<FoodInfo> foodInfos = foodInfoService.getAllFoodInfoByCategoryId(food_category_id);
        model.addAttribute("foodInfos", foodInfos);
        List<FoodInfoDetail> foodInfos2 = foodInfoService.getFoodInfo(food_category_id);
        model.addAttribute("foodInfos2", foodInfos);
        //System.out.println(foodInfos2);/
        //System.out.println(Arrays.deepToString(foodInfos2));
        System.out.println(foodInfos2);
        return "refrigerator/shop";
    }
}
