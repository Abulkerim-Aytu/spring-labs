package com.cydeo;

import com.cydeo.model.Recipe;
import com.cydeo.repository.RecipeRepository;
import com.cydeo.proxy.ShareService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final ShareService shareService;

    public RecipeService(RecipeRepository recipeRepository, @Qualifier("FACE") ShareService shareService) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
    }

      public void prepareRecipe(Recipe recipe){
        recipeRepository.saveRecipe(recipe);
        shareService.share(recipe);
      };




}
