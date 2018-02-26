package com.coocaa.factory.pizza;

public class PizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("sub1")){
            pizza = new SubPizza1();
        } else if (type.equals("sub2")){
            pizza = new SubPizza2();
        }
        return pizza;
    }

}
