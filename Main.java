package com.company;

import com.company.product.Meal;
import com.company.product.MealBuilder;
import com.company.product.NonVegMealBuilder;
import com.company.product.VegetarianMealBuilder;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Director director = new Director();
//        Meal vegMeal = new Meal();
        MealBuilder vegMealBuilder = new VegetarianMealBuilder();
        director.construct(vegMealBuilder);
        Meal vegMealProduct = director.getMeal();
        Meal secondVegMeal = vegMealBuilder.getMeal();
        secondVegMeal.showItems();
        vegMealProduct.showItems();
    }
}
