package com.coocaa.combining;

public class QuackObserver implements Observer {

    public void update(Quackable duck) {
        System.out.println(this.toString() + " 你听 "+ duck + "------------------叫了");
    }
}
