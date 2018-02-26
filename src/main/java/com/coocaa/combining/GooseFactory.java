package com.coocaa.combining;

public class GooseFactory implements AbstractGooseFactory {
    public Goose createGoose() {
        return new Goose();
    }

    public Quackable createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
