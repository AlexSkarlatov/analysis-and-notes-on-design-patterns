package com.company.product;

import com.company.items.VegetarianBurger;
import com.company.items.WaterBottle;

public class VegetarianMealBuilder  implements MealBuilder {
   Meal veggieMeal = new Meal();

//    VegetarianMealBuilder(Meal m){
//        this.m = m;
//    }


    @Override
    public void buildBurger() {
        veggieMeal.addItem(new VegetarianBurger());
//        list.addLast(new VegetarianBurger());
    }

    @Override
    public void buildDrink() {

        veggieMeal.addItem(new WaterBottle());
//        list.addLast(new WaterBottle());
    }

    @Override
    public Meal getMeal() {
        return veggieMeal;
        //used to extend from meal now it doesnt due to being too tightly coupled
        //mistake on my part
//        return this;
    }
}
