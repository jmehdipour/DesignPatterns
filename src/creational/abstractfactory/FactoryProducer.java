package creational.abstractfactory;

public class FactoryProducer{

    public AbstractFactory createFactory(String factoryType){
        if("Vehicle".equalsIgnoreCase(factoryType)){
            return new VehicleFactory();
        }else if("Color".equalsIgnoreCase(factoryType)){
            return new ColorFactory();
        }else{
            return null;
        }
    }


}