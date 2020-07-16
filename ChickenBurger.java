package com.company;

public class ChickenBurger extends BurgerAbstract implements Packing {

    public ChickenBurger(){
        name = "chickeny chickn burger for you";
        price = 21.24;
    }

    @Override
    public String pack() {
        return "put inside one of those styrofoam calmshell containers with some fries";
    }
}
