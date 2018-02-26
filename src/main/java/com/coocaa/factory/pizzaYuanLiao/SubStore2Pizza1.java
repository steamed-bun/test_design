package com.coocaa.factory.pizzaYuanLiao;

public class SubStore2Pizza1 extends Pizza {

    PizzaFactory pizzaFactory;

    public SubStore2Pizza1(PizzaFactory pizzaFactory) {

        this.pizzaFactory = pizzaFactory;
        name = "SubStore2Pizza1";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        cheese = pizzaFactory.creatCheese();
    }
}
