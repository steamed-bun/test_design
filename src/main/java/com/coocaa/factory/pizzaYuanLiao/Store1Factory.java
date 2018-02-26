package com.coocaa.factory.pizzaYuanLiao;

public class Store1Factory implements PizzaFactory{
    public Dough creatDough() {
        return new Store1Dough();
    }

    public Cheese creatCheese() {
        return new Store1Cheese();
    }
}
