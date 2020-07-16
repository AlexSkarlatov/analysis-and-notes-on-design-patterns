package com.company;

public class Pepsi extends DrinkAbstract implements Packing{
    public Pepsi(){
        name = "thirst quenching pepsi";
        price = 3.00;
    }
    @Override
    public String pack() {
        return this.name + "stored in a cup";
    }
}
