package com.company;

public abstract class AbstractFactory {
    abstract AbstractMovie getComedyMovie(String studioChoice);
    abstract AbstractMovie getActionMovie(String studioChoice);


}

class ComedyMovieFactory extends AbstractFactory {

    @Override
    AbstractMovie getComedyMovie(String studioChoice) {
        //return comedyImplemementationobject
//        return new ComedyImplementation();
        if(studioChoice.equalsIgnoreCase("Hollywood")){
            return new HollywoodComedyMovieI();
        }
        else if( studioChoice.equalsIgnoreCase("Bollywood")){
            return new BollywoodComedyMovieI();
        }
        return null;
    }

    @Override
    AbstractMovie getActionMovie(String studioChoice) {
        return null;
    }
}


class ActionMovieFactory extends AbstractFactory {

    @Override
    public AbstractMovie getComedyMovie(String studioChoice) {
        return null;
    }

    @Override
    public AbstractMovie getActionMovie(String studioChoice) {
//        return new ActionImplementation();
        if(studioChoice.equalsIgnoreCase("Hollywood")){
            return new HollywoodActiomMovieI("name movie");
        }
        else if( studioChoice.equalsIgnoreCase("Bollywood")){
            return new BollywoodActiomMovieI();
        }
//        return null;
        return null;
    }
}