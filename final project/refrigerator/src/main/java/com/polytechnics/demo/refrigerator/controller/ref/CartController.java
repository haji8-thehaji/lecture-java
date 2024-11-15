package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnics.demo.refrigerator.model.ref.Cart;
import com.polytechnics.demo.refrigerator.model.ref.Recipe;
import com.polytechnics.demo.refrigerator.service.ref.CartService;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

	@GetMapping("/cart")
	public String member_haji(Model model) {
		List<Cart> cartList = cartService.getAllCarts();
		model.addAttribute("recipeList", cartList);
        return "haji/board/cart";
	}
}
