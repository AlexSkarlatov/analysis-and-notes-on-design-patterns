package com.company;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("comedy")){
            return new ComedyMovieFactory();
        }
        else if(choice.equalsIgnoreCase("Action")){
            return new ActionMovieFactory();
        }
        return null;
    }

}
