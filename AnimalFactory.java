package com.company;

public class AnimalFactory {
    public Animal getAnimalObject(String s){
        //bftp error correction strat
        if(s == null)
        {
            return null;
        }
        else if(s.equalsIgnoreCase("tiger")){
            return new Tiger();
        }
        else if(s.equalsIgnoreCase("duck")){
            return new Duck();
        }

        return null;
    }

}
