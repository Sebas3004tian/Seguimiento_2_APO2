package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class RecipeTest {
	private Recipe recipe;

	public void setupStage1(){
		recipe = new Recipe();
	}
	public void setupStage2(){
		recipe = new Recipe();
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}
	
	@Test
	void test1() {
		setupStage1();
		
		recipe.addIngredient("Sal", 12);
		
		assertEquals(1, recipe.getIngredients().size());
	}
	@Test
	void test2() {
		setupStage2();
		
		recipe.addIngredient("Pimienta", 6);
		
		int ultimo=recipe.getIngredients().size()-1;
		
		assertEquals(4, recipe.getIngredients().size());
		assertEquals("Pimienta", recipe.getIngredients().get(ultimo).getName());
		assertEquals(6, recipe.getIngredients().get(ultimo).getWeight());
		
	}
	@Test
	void test3() {
		setupStage2();
		
		assertEquals(3, recipe.getIngredients().size());
		
		int posicionAjo = 0;
		
		for(int i = 0; i<(recipe.getIngredients().size()-1);i++) {
			if(recipe.getIngredients().get(i).getName().equalsIgnoreCase("Ajo")) {
				recipe.getIngredients().get(i).setWeight(79);
				posicionAjo=i;
			}
		}
		
		assertEquals(79, recipe.getIngredients().get(posicionAjo).getWeight());
		
		
		
		
	}
	@Test
	void test4() {
		setupStage2();
		
		for(int i = 0; i<(recipe.getIngredients().size()-1);i++) {
			if(recipe.getIngredients().get(i).getName().equalsIgnoreCase("Ajo")) {
				recipe.getIngredients().remove(i);
			}
		}
		assertEquals(2, recipe.getIngredients().size());
		
	}

}
