package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AnimalFactory animalFactory = new AnimalFactory();
        Animal duck = animalFactory.getAnimalObject("duck");
        duck.eat();
        duck.walk();
        duck.roar();
        Animal tiger = animalFactory.getAnimalObject("tiger");
        tiger.eat();
        tiger.walk();
        System.out.println(tiger.roar());

    }
}
