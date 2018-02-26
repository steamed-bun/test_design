package com.coocaa.factory.pizzaf;

public class SubStore2 extends PizzaStore{

    @Override
    public Pizza creatPizza(String type) {
        Pizza pizza = null;
        if (type.equals("sub2P1")){
            pizza = new SubStore2Pizza1();
        } else if (type.equals("sub2P2")){
            pizza = new SubStore2Pizza2();
        }
        return pizza;
    }

}
