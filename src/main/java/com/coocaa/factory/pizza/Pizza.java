package com.coocaa.factory.pizza;

abstract public class Pizza {

    String name;

    @Override
    public String toString() {
        return "pizza{" +
                "name='" + name + '\'' +
                '}';
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
