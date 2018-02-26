package com.coocaa.command.remote;

public class StereoHighCommand implements Command {

    private Stereo stereo;
    private int prevVolume;

    public StereoHighCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.high();
    }

    public void undo() {
        if (prevVolume == stereo.HIGH) {
            stereo.high();
        } else if (prevVolume == stereo.MEDIUM) {
            stereo.medium();
        } else if (prevVolume == stereo.LOW) {
            stereo.low();
        } else if (prevVolume == stereo.OFF) {
            stereo.OFF();
        }
    }
}
