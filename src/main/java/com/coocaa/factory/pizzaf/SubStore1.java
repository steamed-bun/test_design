package com.coocaa.factory.pizzaf;

public class SubStore1 extends PizzaStore{

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        if (type.equals("sub1P1")){
            pizza = new SubStore1Pizza1();
        } else if (type.equals("sub1P2")){
            pizza = new SubStore1Pizza2();
        }
        return pizza;
    }

}
