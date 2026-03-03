package ObserverPattern.Subject;

import ObserverPattern.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private List<Observer> observersList;

    public WeatherData() {
        observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(List<Observer> observers) {
        for(Observer o: observersList) {
            o.update();
        }
    }

    public void updateData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers(this.observersList);
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }
}
