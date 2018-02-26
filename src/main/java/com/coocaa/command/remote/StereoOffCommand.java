package com.coocaa.command.remote;

public class StereoOffCommand implements Command {

    private Stereo stereo;
    private int prevVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.OFF();
        stereo.off();
    }

    public void undo(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
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
