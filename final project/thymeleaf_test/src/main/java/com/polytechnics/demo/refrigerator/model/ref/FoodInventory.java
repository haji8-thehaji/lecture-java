package com.polytechnics.demo.refrigerator.model.ref;

import java.util.Date;

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
@Table(name="FOOD_INVENTORY")
public class FoodInventory {
    
	@Id
	@Column(name="id")
	private int id;
	private int food_id;
    private Date expire_date;
    private String volume;
    private Date created_dt;
    private Date deleted_dt;
}