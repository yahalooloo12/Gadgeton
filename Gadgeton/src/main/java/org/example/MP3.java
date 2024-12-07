package org.example;

public class MP3 extends MP{
    private int screenSize;

    public MP3(int camoot, int Mehir, String Type, String Creator, boolean GotRadio, boolean GotSpeaker, int screenSize) {
        super(camoot, Mehir, Type, Creator, GotRadio, GotSpeaker);
        this.screenSize = screenSize;
    }
}
