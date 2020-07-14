package com.company;

public abstract class AbstractMovie {
    String name;
    String studioType;
    public abstract void getName();
    public abstract void getStudioType();
    public abstract void setName();
    public abstract void setStudioType();

}


class HollywoodActiomMovieI extends AbstractMovie{
    HollywoodActiomMovieI(String name){
        this.studioType = "Hollywood";
        this.name = name;
    }
    @Override
    public void getName() {

    }

    @Override
    public void getStudioType() {

    }

    @Override
    public void setName() {

    }

    @Override
    public void setStudioType() {

    }
}
class HollywoodComedyMovieI extends AbstractMovie{

    @Override
    public void getName() {

    }

    @Override
    public void getStudioType() {
        System.out.println("youa are watching a hollywood comedy movies");
    }

    @Override
    public void setName() {

    }

    @Override
    public void setStudioType() {

    }
}
class BollywoodActiomMovieI extends AbstractMovie{

    @Override
    public void getName() {

    }

    @Override
    public void getStudioType() {

    }

    @Override
    public void setName() {

    }

    @Override
    public void setStudioType() {

    }
}
class BollywoodComedyMovieI extends AbstractMovie{

    @Override
    public void getName() {

    }

    @Override
    public void getStudioType() {

    }

    @Override
    public void setName() {

    }

    @Override
    public void setStudioType() {

    }
}