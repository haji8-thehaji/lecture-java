package com.polytechnics.demo.refrigerator.model.ref.common;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FoodInfoDetail {
	@Id
	private int id;
	private int foodCategoryId;
	private String name;
    private int standard_expire_day;
    private int standard_price;
    private String standard_volume;
    private String storage_type;
    private int custom_bool;
    private int season_spring;
    private int season_summer;
    private int season_autumn;
    private int season_winter;
    private String category_name;

}