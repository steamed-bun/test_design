package com.coocaa.factory.pizzaYuanLiao;

public class SubStore2 extends PizzaStore {

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        PizzaFactory pizzaFactory = new Store2Factory();
        if (type.equals("sub2P1")){
            pizza = new SubStore2Pizza1(pizzaFactory);
        } else if (type.equals("sub2P2")){
            pizza = new SubStore2Pizza2(pizzaFactory);
        }
        return pizza;
    }

}
