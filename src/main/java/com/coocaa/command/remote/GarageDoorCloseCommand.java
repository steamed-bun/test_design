package com.coocaa.command.remote;

public class GarageDoorCloseCommand implements Command {

    private Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        garage.doorClose();
    }

    public void undo(){
        garage.doorOpen();
    }

}
