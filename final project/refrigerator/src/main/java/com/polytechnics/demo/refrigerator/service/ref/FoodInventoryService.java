package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Memo;
import com.polytechnics.demo.refrigerator.model.ref.common.Food;
import com.polytechnics.demo.refrigerator.repository.FoodInventoryRepository;
import com.polytechnics.demo.refrigerator.repository.MemoRepository;

@Service
public class FoodInventoryService{
    @Autowired
    private FoodInventoryRepository foodInventoryRepository;
    public List<Food> getAllFoodInventory() { 
        return foodInventoryRepository.getFood();
    } 
}