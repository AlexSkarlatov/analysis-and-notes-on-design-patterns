package com.company;

import java.util.LinkedList;

public class NonVegMealBuilder extends Meal implements MealBuilder{



    @Override
    public void buildBurger() {
        list.addLast( new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        list.add(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return this;
    }
}
