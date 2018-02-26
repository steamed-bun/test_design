package com.coocaa.state;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldSOutState;
    State winnerState;

    State state;
    int count = 0;

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

    public int getCount() {
        return count;
    }

    public void releaseBall(){
        if (count > 0){
            count = count - 1;
        }
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldSOutState() {
        return soldSOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
