package v1;

public class ForecastDisplay implements DisplayElement{
    float temp;
    float humidity;
    float pressure;
    public ForecastDisplay(){
        this.temp = .0f;
        this.humidity = .0f;
        this.pressure = .0f;
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
