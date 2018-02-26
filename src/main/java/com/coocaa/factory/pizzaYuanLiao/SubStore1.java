package com.coocaa.factory.pizzaYuanLiao;

public class SubStore1 extends PizzaStore {

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        PizzaFactory pizzaFactory = new Store1Factory();
        if (type.equals("sub1P1")){
            pizza = new SubStore1Pizza1(pizzaFactory);
        } else if (type.equals("sub1P2")){
            pizza = new SubStore1Pizza2(pizzaFactory);
        }
        return pizza;
    }

}
