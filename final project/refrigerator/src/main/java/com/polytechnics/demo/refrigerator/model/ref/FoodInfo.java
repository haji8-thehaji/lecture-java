package com.polytechnics.demo.refrigerator.model.ref;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="FOOD_INFO")
public class FoodInfo {
    
	@Id
	@Column(name="id")
	private int id;
	private int foodCategoryId;
	private String name;
	private String image;
    private int standard_expire_day;
    private int standard_price;
    private String standard_volume;
    private String storage_type;
    private int custom_bool;
    private int season_spring;
    private int season_summer;
    private int season_autumn;
    private int season_winter;
}