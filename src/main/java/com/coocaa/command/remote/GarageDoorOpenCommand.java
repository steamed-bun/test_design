package com.coocaa.command.remote;

public class GarageDoorOpenCommand implements Command {

    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        garage.doorOpen();
    }

    public void undo(){
        garage.doorClose();
    }

}
