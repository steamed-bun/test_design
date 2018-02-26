package com.coocaa.weatherJava;


import java.util.Observable;
import java.util.Observer;

public class Temper2Dispaly implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;
    private Observable observable;

    public Temper2Dispaly(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void dispaly() {
        System.out.println("1实时温度/湿度/压强分别为："+ temp +
                "/" + humidity + "/" + pressure);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            dispaly();
        }
    }
}
