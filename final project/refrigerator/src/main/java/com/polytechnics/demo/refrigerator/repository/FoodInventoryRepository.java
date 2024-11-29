package com.polytechnics.demo.refrigerator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;

public interface FoodInventoryRepository extends JpaRepository<FoodInventory, Integer> {
    List<FoodInventory> findById(int Id);

    // @Query("select f.id , fc.name as category_name from food_info as f inner join
    // food_category as fc on f.category_id =:foodCategoryId", nativeQuery = true)
    // List<Object[]> findByFoodInfoByFoodCategoryId(@Param("foodCategoryId") int
    // foodCategoryId );
    // @Query(value = "SELECT f.*, fc.name as info_name FROM FOOD_INVENTORY f inner
    // join FOOD_INFO as fc on f.food_info_id = fc.id WHERE f.food_info_id =:bno
    // nativeQuery = true)")
    // Object[] findAllActiveUsersNative(@Param("bno") int bno);
}