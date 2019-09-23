package creational.abstractfactory;

public class VehicleFactory extends AbstractFactory {

    public Vehicle getVehicle(String vehicleType){
        if("Car".equalsIgnoreCase(vehicleType)){
            return new Car();
        }else if("MotorCycle".equalsIgnoreCase(vehicleType)){
            return new MotorCycle();
        }else{
            return null;
        }
    }

}