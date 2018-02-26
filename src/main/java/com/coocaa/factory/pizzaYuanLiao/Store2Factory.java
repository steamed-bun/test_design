package com.coocaa.factory.pizzaYuanLiao;

public class Store2Factory implements PizzaFactory{
    public Dough creatDough() {
        return new Store2Dough();
    }

    public Cheese creatCheese() {
        return new Store2Cheese();
    }
}
