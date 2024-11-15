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
@Table(name="FOOD_CATEGORY")
public class FoodCetegory {
    
	@Id
	@Column(name="id")
	private int id;
    private String name;
}