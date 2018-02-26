package com.coocaa.factory.pizzaf;

abstract public class PizzaStore {

    public Pizza order(String type){
        Pizza pizza = creatPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza creatPizza(String type);

}
