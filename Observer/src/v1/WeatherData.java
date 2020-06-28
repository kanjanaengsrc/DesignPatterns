package v1;
class WeatherData {
    float temp;
    float humidity;
    float pressure;
    DisplayElement current;
    DisplayElement stat;
    DisplayElement forecast;
    public WeatherData() {
        this.current = new CurrentConditionsDisplay();
        this.stat = new StatisticDisplay();
        this.forecast = new ForecastDisplay();
    }
    public void measurementsChanged() {
        this.temp = getTemp();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        this.current.update(this.temp, this.humidity, this.pressure);
        this.stat.update(this.temp, this.humidity, this.pressure);
        this.forecast.update(this.temp, this.humidity, this.pressure);
        this.current.showData();
        this.stat.showData();
        this.forecast.showData();
    }

    private float getTemp() {
        return (float)Math.random() * 100;
    }
    private float getHumidity() {
        return (float)Math.random() * 50;
    }
    private float getPressure() {
        return (float)Math.random() * 80;
    }
}