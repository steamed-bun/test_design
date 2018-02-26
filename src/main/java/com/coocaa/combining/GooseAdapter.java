package com.coocaa.combining;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.quack();
    }

    public void addObserver(Observer observer) {

    }

    public void notifyObservers() {

    }
}
