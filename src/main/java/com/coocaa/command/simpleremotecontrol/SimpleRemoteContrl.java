package com.coocaa.command.simpleremotecontrol;

public class SimpleRemoteContrl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }

}
