package com.company;

import com.company.MealBuilder;

import java.util.LinkedList;

public class VegetarianMealBuilder extends Meal implements MealBuilder {
    @Override
    public void buildBurger() {
        list.addLast(new VegetarianBurger());
    }

    @Override
    public void buildDrink() {
        list.addLast(new WaterBottle());
    }

    @Override
    public Meal getMeal() {
        return this;
    }
}
