package com.haji.demo.thymeleaf_test.model.ref;

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
@Table(name="RECIPE")
public class Recipe {
    
	@Id
	@Column(name="id")
	private String id;
	private String Ingredients;
	private String Steps;
}