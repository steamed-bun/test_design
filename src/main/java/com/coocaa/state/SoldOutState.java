package com.coocaa.state;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("没货啦,投钱也吐不出来糖了...");
    }

    public void ejectQuarter() {
        System.out.println("没投钱,还想退...");
    }

    public void turnCrank() {
        System.out.println("别再转了,再转也没货...");
    }

    public void dispense() {
        System.out.println("都说了没货啦...");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.noQuarterState);
    }
}
