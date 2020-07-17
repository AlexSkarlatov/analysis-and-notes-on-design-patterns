package com.company.items;

import com.company.Packing;

public class WaterBottle extends DrinkAbstract implements Packing {
    public WaterBottle(){
        name = "Watery water bottle";
        price = 2.01;
    }
    @Override
    public String pack() {
        return  name + "stored in  bottle";
    }
}
