package com.coocaa.command.remote;


public class RemoteContrl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;


    public RemoteContrl() {

        onCommands = new Command[4];
        offCommands = new Command[4];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 4; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offComand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offComand;
    }

    public void OnbuttonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void OffbuttonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++){
//            stringBuilder.append("[slot"+ i + "] " + onCommands[i].getClass().getName()
//            + "\t\t\t" + offCommands[i].getClass().getName() + "\n");
//            与下面相同，但是省去了 + 拼接，在循环中少用 +
            stringBuilder.append("[slot").append(i).append("] ").append(onCommands[i].getClass().getName()
            ).append("\t\t\t").append(offCommands[i].getClass().getName()).append("\n");
        }

        return stringBuilder.toString();
    }
}
