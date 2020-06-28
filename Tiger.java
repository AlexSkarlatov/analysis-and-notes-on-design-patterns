package com.company;

public class Tiger implements Animal {

    @Override
    public void walk() {
        System.out.println("tiger walking");
    }

    @Override
    public void eat() {
        System.out.println("tiger eating");
    }

    @Override
    public String roar() {
        return "tiger noiseses";
    }
}
