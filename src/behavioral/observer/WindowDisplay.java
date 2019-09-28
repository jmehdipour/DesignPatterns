package behavioral.observer;

public class WindowDisplay implements Observer, Display {
    private WeatherStation station;

    public WindowDisplay(WeatherStation station) {
        this.station = station;
        station.register(this);
    }

    @Override
    public void display() {
        System.out.println("refresh displaying on window. new temperature is " + station.getTemperature());
    }

    @Override
    public void update() {
        station.getTemperature();
        display();
    }
}
