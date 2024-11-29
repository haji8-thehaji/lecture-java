package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polytechnics.demo.refrigerator.model.ref.FoodCategory;

@Repository
public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Integer> {
    
}
