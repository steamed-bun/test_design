package com.coocaa.combining;

public class RedDuck implements Quackable {

    private QuackObservable quackObservable;

    public RedDuck() {
        quackObservable = new Observable(this);
    }


    public void quack() {
        System.out.println("redDuck quack...");
        quackObservable.notifyObservers();
    }

    public void addObserver(Observer observer) {
        quackObservable.addObserver(observer);
    }

    public void notifyObservers() {
        quackObservable.notifyObservers();
    }
}
