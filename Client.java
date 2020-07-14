public class Client {
    public static void main(String[] args){
        System.out.println("starting builder exampel *** \n");


        //bilder pattern needs 2 things, a instance of director and an instance of builder
        Director director = new Director();

        //create a builder of type ubilder interface for polymorphism reasons so the
        //director can easily handle many different implementations of a builder interface
        //with minimal coupleing
        BuilderInterface carBuilder = new Car();
        System.out.println("***this is before construct is called*** \n");
        Product beforeConstruct = carBuilder.getVehicle();


        BuilderInterface motorBuilder = new Motorcycle();
        BuilderInterface tankBuilder = new ScifiTank();



        //you indirectly order the builder by ordering a director to order the builder
        //to construct the object reprepsentation
        director.construct(carBuilder);
        director.construct(motorBuilder);
        director.construct(tankBuilder);
        System.out.println(" end *** \n");


        //this is a representation of the procuct
        //you retrieve the product from a builder
        Product createCar =  carBuilder.getVehicle();
        Product createMotorcycle =  motorBuilder.getVehicle();
        Product createTank =  tankBuilder.getVehicle();

        System.out.println("***show all products you extracted from builder*** \n");

        //repres
//        System.out.println(createCar.show());
        createCar.show();
        System.out.println("***r*** \n");

        createMotorcycle.show();
        System.out.println("***r*** \n");

        createTank.show();

    }


}
