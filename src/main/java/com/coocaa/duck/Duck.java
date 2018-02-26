package com.coocaa.duck;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    Duck() {
        flyBehavior = new FlyNoWay();
    }

    public void swim(){
        System.out.println("duck swim...");
    }

    public abstract void display();

    public void freshFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
