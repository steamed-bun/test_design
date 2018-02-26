package com.coocaa.combining;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        count++;
    }

    public static int getCount(){
        return count;
    }

    public void addObserver(Observer observer) {
        duck.addObserver(observer);
    }

    public void notifyObservers() {
        duck.notifyObservers();
    }
}
