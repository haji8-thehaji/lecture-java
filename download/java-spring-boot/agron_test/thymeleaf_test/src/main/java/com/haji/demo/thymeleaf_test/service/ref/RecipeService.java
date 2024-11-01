package com.haji.demo.thymeleaf_test.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haji.demo.thymeleaf_test.model.ref.Recipe;
import com.haji.demo.thymeleaf_test.repository.ref.RecipeRepository;

@Service
public class RecipeService{
    @Autowired
    private RecipeRepository recipeRepository;
    public List<Recipe> getAllRecipes() { 
        return recipeRepository.findAll();
    } 
}