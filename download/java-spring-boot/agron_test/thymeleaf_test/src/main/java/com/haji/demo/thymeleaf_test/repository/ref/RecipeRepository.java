package com.haji.demo.thymeleaf_test.repository.ref;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haji.demo.thymeleaf_test.model.ref.Recipe;


public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}