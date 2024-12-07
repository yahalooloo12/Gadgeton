package org.example;

public abstract class MP extends Gadget {
    private boolean GotRadio;
    private boolean GotSpeaker;

    public MP(int camoot, int Mehir, String Type, String Creator, boolean GotRadio, boolean GotSpeaker) {
        super(camoot, Mehir, Type, Creator);
        this.GotRadio = GotRadio;
        this.GotSpeaker = GotSpeaker;
    }
}
