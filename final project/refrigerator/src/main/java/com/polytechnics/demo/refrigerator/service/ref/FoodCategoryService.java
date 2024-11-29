package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.FoodCategory;
import com.polytechnics.demo.refrigerator.repository.FoodCategoryRepository;

@Service
public class FoodCategoryService{
    @Autowired
    private FoodCategoryRepository foodCategoryRepository;
    public List<FoodCategory> getAllFoodCetegorys() { 
        return foodCategoryRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}