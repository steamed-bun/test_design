package com.coocaa.factory.pizzaYuanLiao;

abstract public class PizzaStore {

    public Pizza order(String type){
        Pizza pizza = creatPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza creatPizza(String type);

}
