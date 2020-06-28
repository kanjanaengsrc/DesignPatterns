package v2;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject w){
        this.weatherData = w;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p) {
        this.temp = t;
        this.humidity = h;
        this.pressure = p;
        showData();
    }
    @Override
    public void showData(){
        System.out.printf("---- Current condition device ----\n"
        +"Temp = %.2f c, humidity = "
        +"%.2f %% and pressure = %.2f\n",this.temp,this.humidity,this.pressure);
    }
}