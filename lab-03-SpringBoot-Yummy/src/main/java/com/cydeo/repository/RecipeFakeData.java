package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class RecipeFakeData implements RecipeRepository {
    @Override
    public void save(Recipe recipe) {
        System.out.println(recipe);
    }
}
