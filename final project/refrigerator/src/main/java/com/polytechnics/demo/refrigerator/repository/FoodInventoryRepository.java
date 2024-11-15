package com.polytechnics.demo.refrigerator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.polytechnics.demo.refrigerator.model.ref.common.Food;
import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;

@Repository
public interface FoodInventoryRepository extends JpaRepository<FoodInventory, Integer> {
    
    @Query(value="SELECT f.name, fi.id FROM FOOD_INVENTORY fi INNER JOIN FOOD_INFO f on fi.food_id = f.id", nativeQuery=true)
    List<Food> getFood();
}
