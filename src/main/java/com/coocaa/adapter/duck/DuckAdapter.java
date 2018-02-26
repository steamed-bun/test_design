package com.coocaa.adapter.duck;

import java.util.Random;

public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        //平均五次只飞一次
        if (random.nextInt(5) == 1){
            duck.fly();
        }
    }
}
