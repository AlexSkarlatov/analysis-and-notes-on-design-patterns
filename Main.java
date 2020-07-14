package com.company;

public class Main {
//changes
    public static void main(String[] args) {
	// write your code here
        AbstractFactory af = FactoryProducer.getFactory("comedy");
        AbstractMovie hollywoodComedy = af.getComedyMovie("Hollywood");
//        System.out.println(hollywoodComedy);
        hollywoodComedy.getStudioType();
    }
}



