package creational.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType){
        
        if("Red".equalsIgnoreCase(colorType)){
            return new Red();
        }else if("Blue".equalsIgnoreCase(colorType)){
            return new Blue();
        }else if("Green".equalsIgnoreCase(colorType)){
            return new Green();
        }else{
            return null;
        }

    }

    @Override
    public Vehicle getVehicle(String vehicleType) {
        return null;
    }

}