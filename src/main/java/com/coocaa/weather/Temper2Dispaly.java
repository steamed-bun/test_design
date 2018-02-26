package com.coocaa.weather;

public class Temper2Dispaly implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;
    private Subject subject;

    public Temper2Dispaly(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        dispaly();
    }

    public void dispaly() {
        System.out.println("实时温度/湿度/压强分别为："+ temp +
                "/" + humidity + "/" + pressure);
    }
}
