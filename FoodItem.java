package com.company.items;

import com.company.Packing;

public abstract class FoodItem implements Packing {

    //members
//    double subtax=0.2;
    double price ;
    String name;
    //methods
    //getters and setters
//    public Double getint(){
//        return 3.0;
//    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String pack() {
        return "null";
    }
}
