package v2;

import java.util.ArrayList;

class WeatherData implements Subject{
    float temp;
    float humidity;
    float pressure;
    ArrayList<Observer> obs;
    public WeatherData(){
        this.obs = new ArrayList<Observer>();
    }
    public void measurementsChanged(){
        this.temp = (float)getTemp();
        this.humidity = (float)getHumidity();
        this.pressure = (float)getPressure();
        notifyObservers();
    }
    private double getTemp(){
        return Math.random() * 100;
    }
    private double getHumidity(){
        return Math.random() * 50;
    }
    private double getPressure(){
        return Math.random() * 80;
    }

    @Override
    public void registerObserver(Observer ob) {
        obs.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        obs.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : obs) {
            observer.update(this.temp,this.humidity,this.pressure);
        }
    }
}