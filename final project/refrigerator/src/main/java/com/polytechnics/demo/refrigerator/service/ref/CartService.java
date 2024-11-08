package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Cart;
import com.polytechnics.demo.refrigerator.repository.CartRepository;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;


    // 특정 사용자의 카트 조회
    public List<Cart> getAllCart() {
        return null; //cartRepository.findAll();
    }

    // // 카트에 음식 추가 (중복 체크 후)
    // public Cart addFoodToCart(int foodId, String volume, int count, double money) {
    //     Cart existingCart = cartRepository.findByFoodId(foodId);
    //     if (existingCart != null) {
    //         // 기존에 존재하는 경우 수량만 업데이트
    //         existingCart.setCount(existingCart.getCount() + count);
    //         return cartRepository.save(existingCart);
    //     } else {
    //         // 새로운 음식 추가
    //         Cart newCart = new Cart(null, foodId, volume, count, money);
    //         return cartRepository.save(newCart);
    //     }
    // }

    // // 카트에서 음식 제거
    // public void removeFoodFromCart(int foodId) {
    //     Cart existingCart = cartRepository.findByFoodId(foodId);
    //     if (existingCart != null) {
    //         cartRepository.delete(existingCart);
    //     }
    // }

    // // 카트 업데이트 (수량 변경)
    // public Cart updateQuantity(int foodId, int quantity) {
    //     Cart existingCart = cartRepository.findByFoodId(foodId);
    //     if (existingCart != null) {
    //         existingCart.getCount(quantity);
    //         return cartRepository.save(existingCart);
    //     }
    //     return null;
    // }
}
