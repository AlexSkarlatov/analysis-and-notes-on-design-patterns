package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Director director = new Director();
    Meal vegetarianMealBuilder = new VegetarianMealBuilder();
//    Meal reg = new VegetarianBurger();
        director.construct(vegetarianMealBuilder);
        Meal createdVegMeal = vegetarianMealBuilder.getMeal();
        createdVegMeal.showItems();

        //honestly this way just makes way more sense than what was orinally shown
        //but i really gotta think about why it was shown to me in the original way
        //maybe its a design smell or something?
        Director carnivoreMeals = new Director(new NonVegMealBuilder());
        carnivoreMeals.construct();
        carnivoreMeals.showContents();
        Meal createdChickenMeal = carnivoreMeals.getMeal();//return mealbuilder product
        // i really don't get why we cannot just manipulate the product through the director
        // i should have implemented the whole product as an interface and not done it as just a partial event
        //i see that now because it makes it difficult to return a a viable product now i can only
        //manipulate the product through the director and cannot have the director return the product.
        //well i mean ican have it returned but it doesn't look very nice
        // its too tightly coupled and reveals too much about the system and fails in encapsulation
        //
    }
}
