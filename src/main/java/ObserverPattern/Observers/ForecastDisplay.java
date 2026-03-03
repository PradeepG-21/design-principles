package ObserverPattern.Observers;

import ObserverPattern.Display.Display;
import ObserverPattern.Subject.Subject;
import ObserverPattern.Subject.WeatherData;

public class ForecastDisplay implements Observer, Display {

    float prevTemperature;
    float prevHumidity;
    float currentTemperature;
    float currentHumidity;
    WeatherData weatherData;

    public ForecastDisplay(Subject s) {
        this.weatherData = (WeatherData) s;
        s.registerObserver(this);
        System.out.println("Registered observer");
    }

    @Override
    public void display() {
        System.out.println("Forecast Data Display");
        System.out.println(Float.compare(prevTemperature, currentTemperature) > 0 ? "Temperature is expected to fall further" : "Temperature is expected to increase further");
        System.out.println(Float.compare(prevHumidity, currentHumidity) > 0 ? "Humidity is expected to fall further" : "Humidity is expected to increase further");
    }

    @Override
    public void update() {
        this.prevTemperature = this.currentTemperature;
        this.prevHumidity = this.currentHumidity;

        this.currentTemperature = this.weatherData.getTemperature();
        this.currentHumidity = this.weatherData.getHumidity();
        display();
    }

    @Override
    public void subscribe(Subject s) {
        this.weatherData = (WeatherData) s;
        s.registerObserver(this);
    }
}
