package com.polytechnics.demo.refrigerator.model.ref.common;

import java.util.Date;

import com.polytechnics.demo.refrigerator.model.ref.FoodInfo;
import com.polytechnics.demo.refrigerator.model.ref.FoodInventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expire {
    private FoodInfo foodInfo; // FoodInfo 데이터
    private FoodInventory foodInventory; // FoodInventory 데이터
    private Date currentExpireDate; // 현재 유통기한
}
