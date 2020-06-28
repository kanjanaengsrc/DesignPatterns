package v1;

import java.util.Timer;
import java.util.TimerTask;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                weatherData.measurementsChanged();
            }
        };
        timer.scheduleAtFixedRate(task, 1000L, 5000L);
    }
}
