package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;

public interface FoodInventoryRepository extends JpaRepository<FoodInventory, Integer> {

}