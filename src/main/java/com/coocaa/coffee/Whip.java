package com.coocaa.coffee;

public class Whip extends Condiment{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "、Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 33.6;
    }
}
