package ObserverPattern;

import ObserverPattern.Observers.CurrentDataDisplay;
import ObserverPattern.Observers.ForecastDisplay;
import ObserverPattern.Subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.updateData(13, 14);

        CurrentDataDisplay currentDataDisplay = new CurrentDataDisplay(weatherData);
        weatherData.updateData(17, 18);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.updateData(18, 19);

        weatherData.updateData(15, 16);

    }
}
