package com.coocaa.weatherJava;

import com.coocaa.weather.DisplayElement;
import com.coocaa.weather.Subject;

import java.util.Observable;
import java.util.Observer;

public class TemperDispaly implements Observer, DisplayElement {

    private float temp;
    private float tempSum = 0.0f;
    private float minTemp = 0.0f;
    private float maxTemp = 40.0f;
    private int count = 0;
    private Observable observable;

    public TemperDispaly(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            count++;
            tempSum += temp;

            if (temp > maxTemp){
                maxTemp = temp;
            }

            if (temp < minTemp){
                minTemp = temp;
            }

            dispaly();
        }
    }

    public void dispaly() {
        System.out.println("2平均/最低/最高温度分别为："+ tempSum/count + "/" + minTemp +
        "/" + maxTemp);
    }
}
