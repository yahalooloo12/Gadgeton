package org.example;

public class Headphone extends Gadget {
    private int range;

    public Headphone(int camoot, int price, String Type, String creator, int range) {
        super(camoot, price, Type, creator);
        this.range = range;
    }
}
