package org.example;

public abstract class Gadget {
    private String creator;
    private String Type;
    private int Mehir;
    private int camoot;

    public Gadget(int camoot, int Mehir, String Type, String creator) {
        this.camoot = camoot;
        this.Mehir = Mehir;
        this.Type = Type;
        this.creator = creator;
    }

    public int getMehir() {
        return Mehir;
    }

    public void setMehir(int Mehir) {
        this.Mehir = Mehir;
    }

    public String getcreator() {
        return creator;
    }

    public void setcreator(String creator) {
        this.creator = creator;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getcamoot() {
        return camoot;
    }

    public void setcamoot(int camoot) {
        this.camoot = camoot;
    }
}
