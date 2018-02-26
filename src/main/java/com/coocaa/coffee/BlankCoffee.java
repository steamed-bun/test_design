package com.coocaa.coffee;

public class BlankCoffee extends Beverage{

    public BlankCoffee() {
        description = "BlankCoffee";
    }

    @Override
    public double cost() {
        return 12.56;
    }
}
