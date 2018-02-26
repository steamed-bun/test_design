package com.coocaa.combining;

public class DuckFactory implements AbstractDuckFactory {
    public Quackable createRedDuck() {
        return new RedDuck();
    }

    public Quackable createGreenDuak() {
        return new GreenDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
