package com.polytechnics.demo.refrigerator.controller.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.polytechnics.demo.refrigerator.model.ref.Cart;
import com.polytechnics.demo.refrigerator.service.ref.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    // 생성자 주입 방식으로 CartService를 주입받기
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // 사용자의 카트 조회
    @GetMapping("/")
    public ResponseEntity<List<Cart>> getAllCart() {
        List<Cart> cartList = cartService.getAllCart();
        if (cartList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(cartList, HttpStatus.OK);
    }

    // 카트에 음식 추가
    /*
    @PostMapping("/")
    public ResponseEntity<Cart> addFoodToCart(
            @RequestParam int foodId,
            @RequestParam String volume,
            @RequestParam int quantity,
            @RequestParam double price) {
                Cart addedCart = cartService.addFoodToCart( foodId, volume, quantity, price);
        return new ResponseEntity<>(addedCart, HttpStatus.CREATED);
    } */

    // // 카트에서 음식 제거
    // @DeleteMapping("/food/{foodId}")
    // public ResponseEntity<Void> removeFoodFromCart( @PathVariable int foodId) {
    //     cartService.removeFoodFromCart(foodId);
    //     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    // }

    // 카트 수량 업데이트
    /*
    @PutMapping("/food/{foodId}")
    public ResponseEntity<Cart> updateFoodQuantity(
            @PathVariable int foodId,
            @RequestParam int quantity) {
        Cart updatedCart = cartService.updateCount(foodId, quantity);
        if (updatedCart == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedCart, HttpStatus.OK);
    } */
}
