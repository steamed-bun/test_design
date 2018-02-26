package com.coocaa.combining;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{

    ArrayList<Quackable> ducks = new ArrayList<Quackable>();

    public void add(Quackable duck){
        ducks.add(duck);
    }

    public void quack() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }
    }

    public void addObserver(Observer observer) {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.addObserver(observer);
        }
    }

    public void notifyObservers() {
        Iterator iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.notifyObservers();
        }
    }
}
