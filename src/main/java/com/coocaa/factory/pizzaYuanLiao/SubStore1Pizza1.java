package com.coocaa.factory.pizzaYuanLiao;

public class SubStore1Pizza1 extends Pizza {

    private PizzaFactory pizzaFactory;

    public SubStore1Pizza1(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        this.name = "SubStore1Pizza1";
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaFactory.creatDough();
        cheese = pizzaFactory.creatCheese();
    }
}
