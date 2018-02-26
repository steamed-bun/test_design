package com.coocaa.combining;

public class DuckCounterFactory implements AbstractDuckFactory {
    public Quackable createRedDuck() {
        return new QuackCounter(new RedDuck());
    }

    public Quackable createGreenDuak() {
        return new QuackCounter(new GreenDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
