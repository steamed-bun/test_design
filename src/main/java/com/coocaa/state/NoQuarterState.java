package com.coocaa.state;

public class NoQuarterState implements State{

    private GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("已投入钱");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("未投入钱...");
    }

    public void turnCrank() {
        System.out.println("未投入钱");
    }

    public void dispense() {
        System.out.println("未投入钱");
    }

    public void refill() {

    }
}
