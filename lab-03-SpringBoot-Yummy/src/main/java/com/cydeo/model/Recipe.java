package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Recipe {
    private String id;
    private String name;
    private String duration;
    private String preparation;
    private Ingredients ingredients;
    private RecipeType recipeType;


}
