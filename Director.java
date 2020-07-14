public class Director {
    BuilderInterface builderObject ;
    public void construct(BuilderInterface builder){
        builderObject = builder;
        builderObject.buildBody();
        builderObject.insertWheels();
        builderObject.addHeadlights();
    }
//    public BuilderInterface getProduct(){
//
//    }


}
