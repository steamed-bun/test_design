package com.coocaa.factory.pizzaYuanLiao;

public class SubStore2Pizza2 extends Pizza {

    PizzaFactory pizzaFactor;

    public SubStore2Pizza2(PizzaFactory pizzaFactor) {

        this.pizzaFactor = pizzaFactor;
        name = "SubStore2Pizza2";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaFactor.creatDough();
    }
}
