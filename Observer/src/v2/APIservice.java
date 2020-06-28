package v2;
public class APIservice implements Observer{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public APIservice(Subject w){
        this.weatherData = w;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void update(float t, float h, float p) {
        this.temp = t;
        this.humidity = h;
        this.pressure = p;
        generateJSON();
    }
    public void generateJSON(){
        System.out.printf("---- RESTful API ----\n"
        +"{\n'Temp' : '%.2fc',\n 'humidity' : "
        +"'%.2f%%',\n 'pressure' : '%.2f+-4'\n}\n",
        this.temp,this.humidity,this.pressure);
    }
}
