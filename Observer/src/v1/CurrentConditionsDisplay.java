package v1;

public class CurrentConditionsDisplay implements DisplayElement{
    float temp;
    float humidity;
    float pressure;
    public CurrentConditionsDisplay(){
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
        System.out.printf("---- Current condition device ----\n"
        +"Temp = %.2f c, humidity = "
        +"%.2f %% and pressure = %.2f\n",
        this.temp,this.humidity,this.pressure);
    }
}
