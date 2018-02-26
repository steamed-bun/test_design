package com.coocaa.combining;

import java.util.ArrayList;

public class Observable implements QuackObservable{

    private ArrayList<Observer> observers = new ArrayList<>();
    private Quackable duck;

    Observable(Quackable duck) {
        this.duck = duck;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(duck);
        }
        /*
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
        */
    }
}
