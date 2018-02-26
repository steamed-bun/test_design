package com.coocaa.combining;

public class GreenDuck implements Quackable, QuackObservable {

    private QuackObservable quackObservable;

    public GreenDuck() {
        quackObservable = new Observable(this);
    }


    public void quack() {
        System.out.println("GreenDuck quack...");
        quackObservable.notifyObservers();
    }

    public void addObserver(Observer observer) {
        quackObservable.addObserver(observer);
    }

    public void notifyObservers() {
        quackObservable.notifyObservers();
    }
}
