package v1;

public class StatisticDisplay implements DisplayElement{
    float temp;
    float humidity;
    float pressure;
    public StatisticDisplay(){
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
        System.out.printf("---- Statistic device ----\n"
        +"Avg temp = %.2f c, Avg humidity = "
        +"%.2f %% and Avg pressure = %.2f\n",
        this.temp+.3f,this.humidity+2.0f,this.pressure+1.9f);
    }
}
