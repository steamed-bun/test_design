package com.coocaa.weather;

public class TemperDispaly implements Observer, DisplayElement{

    private float temp;
    private float tempSum = 0.0f;
    private float minTemp = 0.0f;
    private float maxTemp = 40.0f;
    private int count = 0;
    private Subject subject;

    public TemperDispaly(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
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

    public void dispaly() {
        System.out.println("平均/最低/最高温度分别为："+ tempSum/count + "/" + minTemp +
        "/" + maxTemp);
    }
}
