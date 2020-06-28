package v2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer c = new CurrentConditionsDisplay(weatherData);
        Observer s = new StatisticDisplay(weatherData);
        Observer f = new ForecastDisplay(weatherData);
        Observer a = new APIservice(weatherData);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                weatherData.measurementsChanged();
            }
        };
        timer.schedule(task, new Date(), 3000);
    }
}
