package com.cydeo.repository;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class RecipeFakeData implements RecipeRepository {
    @Override
    public void saveRecipe(Recipe recipe) {
        System.out.println(recipe);
    }
}
