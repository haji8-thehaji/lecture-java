package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.common.FoodInfoDetail;
import com.polytechnics.demo.refrigerator.repository.FoodInfoRepository;

@Service
public class FoodInfoService {

    @Autowired
    private FoodInfoRepository foodInfopRepository;

    public List<FoodInfo> getAllItems() {
        return foodInfopRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public List<FoodInfo> getAllFoodInfoByCategoryId(int food_category_id) {
        return foodInfopRepository.findByFoodCategoryId(food_category_id);
    }

    public Object[] getAllFoodInfoDetailyCategoryId(int foodCategoryId) {
       return foodInfopRepository.findAllActiveUsersNative(foodCategoryId);
    }

    public List<FoodInfoDetail> getFoodInfo(int foodCategoryId) {
       return foodInfopRepository.findByFoodInfoDetail(foodCategoryId);
    }
    
}

