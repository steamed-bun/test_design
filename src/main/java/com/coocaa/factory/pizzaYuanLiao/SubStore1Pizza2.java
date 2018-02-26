package com.coocaa.factory.pizzaYuanLiao;

class SubStore1Pizza2 extends Pizza {

    private PizzaFactory pizzaFactory;

    SubStore1Pizza2(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        name = "SubStore1Pizza1";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaFactory.creatDough();
    }
}
