package behavioral.observer;

public class PhoneDisplay implements Observer, Display {
    private WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
        station.register(this);
    }

    @Override
    public void display() {
        System.out.println("refresh displaying on phone . new temperature is " + station.getTemperature() );
    }

    @Override
    public void update() {
        display();
    }
}
