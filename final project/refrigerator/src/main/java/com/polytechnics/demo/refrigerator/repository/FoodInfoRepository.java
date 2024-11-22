package com.polytechnics.demo.refrigerator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;

public interface FoodInfoRepository extends JpaRepository<FoodInfo, Integer> {

    List<FoodInfo> findByFoodCategoryId(int foodCategoryId);

}