package com.company;

public class Duck implements Animal{

    @Override
    public void walk() {
        System.out.println("duck is walking");
    }

    @Override
    public void eat() {
        System.out.println("eatin whatever ducks eat");
    }

    @Override
    public String roar() {
        return "dUCK noises";
    }
}
