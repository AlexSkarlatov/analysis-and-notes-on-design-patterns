package com.company.product;

import com.company.items.ChickenBurger;
import com.company.items.Pepsi;

public class NonVegMealBuilder implements MealBuilder {
//    LinkedList
    Meal chickenMeal = new Meal();


    @Override
    public void buildBurger() {
        chickenMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
//        chickenMeal.buildDrink();
//        chickenMeal.add(new Pepsi());
        chickenMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return chickenMeal;
        //return this;
    }
}
