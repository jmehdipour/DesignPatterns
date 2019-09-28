package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    private List<Observer> observerList = new ArrayList<Observer>();
    private float temperature = 25;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList){
            observer.update();
        }
    }

    public float getTemperature(){
        return temperature;
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }

}
