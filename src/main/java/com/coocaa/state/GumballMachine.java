package com.coocaa.state;

public class GumballMachine {

    State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State soldSOutState;
    private State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.soldSOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);
        if (count > 0){
            state = noQuarterState;
        }else {
            state = soldSOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    public void refill(int count){
        System.out.println("重新装填...");
        this.count += count;
        state.refill();
    }

    int getCount() {
        return count;
    }

    void releaseBall(){
        if (count > 0){
            count = count - 1;
        }
    }


    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getSoldSOutState() {
        return soldSOutState;
    }

    State getWinnerState() {
        return winnerState;
    }

    void setState(State state) {
        this.state = state;
    }
}
