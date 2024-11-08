package com.polytechnics.demo.refrigerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polytechnics.demo.refrigerator.model.ref.Recipe;


public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}