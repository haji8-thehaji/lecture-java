package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;
import com.polytechnics.demo.refrigerator.repository.FoodInventoryRepository;

@Service
public class FoodInventoryService {
    @Autowired
    private FoodInventoryRepository FoodInventoryRepository;

    public List<FoodInventory> getAllFoodInventory() {
        return FoodInventoryRepository.findAll();
    }

    public void deleteFoodInventory(int id) {
        FoodInventoryRepository.deleteById(id);
    }

}