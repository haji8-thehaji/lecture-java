package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.polytechnics.demo.refrigerator.model.ref.Cart;
import com.polytechnics.demo.refrigerator.service.ref.ShopService;

@Controller
public class ShopController {

    @Autowired
    ShopService shopService;

    @GetMapping("/shop")
    public String showProducts(Model model) {
        List<Cart> shopItems = shopService.getAllItems();
        model.addAttribute("shopItems", shopItems);
        return "shop";
    }
}
