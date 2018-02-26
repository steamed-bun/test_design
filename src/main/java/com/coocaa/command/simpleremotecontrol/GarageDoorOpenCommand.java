package com.coocaa.command.simpleremotecontrol;

public class GarageDoorOpenCommand implements Command{

    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        garage.DoorOpen();
    }
}
