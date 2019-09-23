package creational.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory vehicleFactory =  FactoryProducer.createFactory("Vehicle");
        Vehicle car = vehicleFactory.getVehicle("Car");
        car.draw();

        Vehicle motorCycle = vehicleFactory.getVehicle("motorcycle");
        motorCycle.draw();

        AbstractFactory colorFactory =  FactoryProducer.createFactory("Color");

        Color red = colorFactory.getColor("red");
        red.fill();

        Color green = colorFactory.getColor("green");
        green.fill();


    }

}