package com.coocaa.command.remote;

public class Stereo {

    static final int LOW = 100;
    static final int MEDIUM = 200;
    static final int HIGH = 500;
    static final int OFF = 0;

    private int volume;

    void on(){
        System.out.println("stereo on...");
    }

    void setCD(){
        System.out.println("stereo setCD...");
    }

    void setVolume(int volume){
        this.volume = volume;
        System.out.println("stereo setVolume " + volume + "...");
    }

    public void off(){
        System.out.println("stereo off...");
    }

    int getVolume() {
        return volume;
    }

    void low() {
        this.volume = LOW;
        System.out.println("volume low");
    }

    void medium() {
        this.volume = MEDIUM;
        System.out.println("volume medium");
    }

    void high() {
        this.volume = HIGH;
        System.out.println("volume high");
    }

    void OFF() {
        this.volume = OFF;
        System.out.println("volume off");
    }
}
