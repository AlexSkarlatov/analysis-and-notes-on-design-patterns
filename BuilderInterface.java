public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}

// why isnt the product native to the interface???????
class Car implements BuilderInterface{
    private Product product = new Product();
//    public Car(){
//        product = new Product();
//    }
    @Override
    public void buildBody() {
        product.add("this is a cody of a car");
    }

    @Override
    public void insertWheels() {
        product.add("add car wheels logic here");
    }

    @Override
    public void addHeadlights() {
        product.add("add 2 headlights for car");

    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
class Motorcycle implements BuilderInterface {
    Product product = new Product();
    @Override
    public void buildBody() {
        product.add("logic : motorcyle body is being added");
    }

    @Override
    public void insertWheels() {
        product.add("insert motorcycle two wheels logic");

    }

    @Override
    public void addHeadlights() {
        product.add("add 1 motorcycle headlight to product4");

    }

    @Override
    public Product getVehicle() {
        return product;
    }
}


class ScifiTank implements BuilderInterface{
    Product product = new Product();

    @Override
    public void buildBody() {
        product.add("add tank body to product");
    }

    @Override
    public void insertWheels() {
        product.add("add 2 tank treads  to product4");
    }

    @Override
    public void addHeadlights() {
        product.add("add 4 tank headlights to prouct");

    }

    @Override
    public Product getVehicle() {
        return product;
    }
}