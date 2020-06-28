package v2;

public class ForecastDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public ForecastDisplay(Subject w){
        this.weatherData = w;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p) {
        this.temp = t;
        this.humidity = h;
        this.pressure = p;
    }
    @Override
    public void showData(){
        System.out.printf("---- Forecast device ----\n"
        +"Temp = %.2f+-2 c, humidity = "
        +"%.2f+-3 %% and pressure = %.2f+-4\n",
        this.temp,this.humidity,this.pressure);
    }
}