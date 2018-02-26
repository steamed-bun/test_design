package com.coocaa.state;

public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("已经在出糖了,别再投钱了...");
    }

    public void ejectQuarter() {
        System.out.println("已经在出糖了,退钱已经晚了...");
    }

    public void turnCrank() {
        System.out.println("已经在出糖了,请勿重复操作...");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            System.out.println("天啊撸,你中大奖了知道不...");
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldSOutState());
            }
        } else {
            gumballMachine.setState(gumballMachine.getSoldSOutState());
        }
    }

    public void refill() {

    }
}
