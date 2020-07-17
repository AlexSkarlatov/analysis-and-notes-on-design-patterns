package com.company.items;

import com.company.Packing;

public class VegetarianBurger extends BurgerAbstract implements Packing {
//    public ChickenBurger(){
//        name = "chickeny chickn burger for you";
//        price = 21.24;
//    }
//     String name = "veggie burger";
    public VegetarianBurger(){
        name = "vegetarian b urger high quality";
        price = 12.25;
    }


    @Override
    public String pack() {
        return "Wrappedup up in veggie paper warapping foil";
    }
}
