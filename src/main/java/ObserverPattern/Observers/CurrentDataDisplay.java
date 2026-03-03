package ObserverPattern.Observers;

import ObserverPattern.Display.Display;
import ObserverPattern.Subject.Subject;
import ObserverPattern.Subject.WeatherData;

public class CurrentDataDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    WeatherData weatherData;

    public CurrentDataDisplay(Subject s) {
        this.weatherData = (WeatherData) s;
        s.registerObserver(this);
        System.out.println("Registered observer");
    }

    @Override
    public void display() {
        System.out.println("Current Data Display");
        System.out.println("Current Temperature is: " + temperature + " Celsius");
        System.out.println("Current Humidity is: " + humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void subscribe(Subject s) {
        this.weatherData = (WeatherData) s;
        s.registerObserver(this);
    }
}
