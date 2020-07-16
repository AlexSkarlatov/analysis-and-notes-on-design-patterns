package com.company;

import java.util.LinkedList;

public class Meal implements MealBuilder{
    LinkedList<FoodItem> list = new LinkedList<>();

    public void addItem(FoodItem addThis){
        list.addLast(addThis);
    }


    public double getCost(){
        double cost = 0;
//        Double c = 0.0;
        for(int i = 0; i < list.size(); i++){
            cost += list.get(i).getPrice();
        }
        return cost;
    }

    public void showItems(){
        System.out.println("your order summary is: \n");
        for(int i = 0 ; i < list.size(); i++){
            int listNum = i + 1;
            System.out.println(listNum + ": " + list.get(i).getName() +
                    " at " + list.get(i).getPrice() + "packaging= " +
                    list.get(i).pack());
        }
    }

    @Override
    public void buildBurger() {
        System.out.println("null");
    }

    @Override
    public void buildDrink() {
        System.out.println("null");
    }

    @Override
    public Meal getMeal() {
        return this;
    }

//    @Override
//    public void buildBurger() {
//
//    }
//
//    @Override
//    public void buildDrink() {
//
//    }
//
//    @Override
//    public void getMeal() {
//
//    }
}
