package com.polytechnics.demo.refrigerator.service.ref;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polytechnics.demo.refrigerator.model.ref.Recipe;
import com.polytechnics.demo.refrigerator.repository.RecipeRepository;

@Service
public class RecipeService{
    @Autowired
    private RecipeRepository recipeRepository;
    public List<Recipe> getAllRecipes() { 
        return recipeRepository.findAll();
    } 
    public void deleteRecipe(int id) { 
        recipeRepository.deleteById(id);
    } 
    
}