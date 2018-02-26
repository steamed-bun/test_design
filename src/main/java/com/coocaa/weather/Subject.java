package com.coocaa.weather;

public interface Subject {

    void removeObserver(Observer observer);
    void addObserver(Observer observer);
    void notifyObservers();

}
