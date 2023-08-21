package com.cydeo;


import com.cydeo.service.RecipeService;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YummyApplication {


	public static void main(String[] args) {

		Faker faker = new Faker();
//		List <Recipe> recipes= new ArrayList<>();
//		recipes.add(new Recipe(faker.food().ingredient(), faker.food().ingredient(),
//				faker.food().dish(), faker.food().dish(),
//				new Ingredients(
//						faker.food().dish(), faker.food().dish(), QuantityType.TBSP
//				),
//				RecipeType.APPETIZER
//		));


		ApplicationContext container = SpringApplication.run(YummyApplication.class, args);

		RecipeService recipeService= container.getBean(RecipeService.class);
//		recipeService.prepareRecipe((Recipe) recipes);
	}



}
