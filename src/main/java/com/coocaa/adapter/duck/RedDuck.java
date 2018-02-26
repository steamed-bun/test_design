package com.coocaa.adapter.duck;

public class RedDuck implements Duck, Comparable{

    public void fly() {
        System.out.println("RedDuck fly...");
    }

    public void quack() {
        System.out.println("RedDuck quack...");
    }

    public int compareTo(Object o) {
        return -1;
    }
}
