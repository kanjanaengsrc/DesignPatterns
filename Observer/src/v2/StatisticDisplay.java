package v2;

public class StatisticDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public StatisticDisplay(Subject w){
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
        System.out.printf("---- Statistic device ----\n"
        +"Avg temp = %.2f c, Avg humidity = "
        +"%.2f %% and Avg pressure = %.2f\n",
        this.temp+.3f,this.humidity+2.0f,this.pressure+1.9f);
    }
}