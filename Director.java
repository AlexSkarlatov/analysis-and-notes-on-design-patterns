package com.company;

import com.company.product.Meal;
import com.company.product.MealBuilder;

public class Director {
    MealBuilder mealBuilderObject;

    public Director(MealBuilder builder){
        mealBuilderObject = builder;
//        his.mealBuilderObject = meal;
    }
    public Director(){

    }
    public Meal getMeal(){
        return mealBuilderObject.getMeal();
//        return this.mealBuilderObject;
    }
    public void setMealBuilderObject(Meal mealBuilderObject){
//        this.mealBuilderObject = mealBuilderObject;

    }
    public void construct(){
        mealBuilderObject.buildBurger();
        mealBuilderObject.buildDrink();
    }
    public void showContents(){
        mealBuilderObject.getMeal().showItems();
//        .showItems();
    }
    public void construct(MealBuilder builder){
        mealBuilderObject = builder;
        mealBuilderObject.buildBurger();
        mealBuilderObject.buildDrink();
//        mealBuilderObject.getMeal().showItems();
    }
}
