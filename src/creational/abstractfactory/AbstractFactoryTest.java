package creational.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory vehicleFactory =  FactoryProducer.createFactory("Vehicle");
        Vehicle car = vehicleFactory.getVehicle("Car");
        car.draw();
    }

}