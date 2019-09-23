package creational.abstractfactory;

public abstract class AbstractFactory {

    public abstract Vehicle getVehicle(String vehicleType);

    public abstract Color getColor(String colorType);

}