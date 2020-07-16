package com.company;

public class Director {
    Meal mealBuilderObject;

    public Director(Meal meal){
        this.mealBuilderObject = meal;
    }
    public Director(){

    }
    public void setMealBuilderObject(Meal mealBuilderObject){
        this.mealBuilderObject = mealBuilderObject;

    }
    public void construct(){
        mealBuilderObject.buildBurger();
        mealBuilderObject.buildDrink();
    }
    public void showContents(){
        mealBuilderObject.showItems();
    }
    public void construct(Meal meal){
        mealBuilderObject = meal;
        mealBuilderObject.buildBurger();
        mealBuilderObject.buildDrink();
    }
}
