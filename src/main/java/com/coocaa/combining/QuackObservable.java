package com.coocaa.combining;

public interface QuackObservable {

    void addObserver(Observer observer);
    void notifyObservers();

}
