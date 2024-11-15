package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnics.demo.refrigerator.model.ref.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
    
}
