package behavioral.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {

        WeatherStation myStation = new WeatherStation();

        PhoneDisplay myPhone = new PhoneDisplay(myStation);
        WindowDisplay kitchenWindow = new WindowDisplay(myStation);
        WindowDisplay roomWindow = new WindowDisplay(myStation);


        myStation.setTemperature(34.5f);
    }


}

