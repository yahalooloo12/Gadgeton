import org.example.Gadget;

public class Shop {
    private Gadget[] gadgetarray;
    public  Shop(){

    }
    public Shop(Gadget[] gadgetarray) {
        this.gadgetarray = gadgetarray;
    }

    public int getValue() {
        int sum = 0;

        for (Gadget gadget : gadgetarray) {
            sum += gadget.getcamoot() * gadget.getMehir();
        }

        return sum;
    }

    public String[] getModel(int Limit) {
        String[] models = new String[gadgetarray.length];

        for (int i = 0; i < gadgetarray.length; i++) {
            if (gadgetarray[i].getcamoot() < Limit) {
                models[i] = gadgetarray[i].getType();
            }
        }

        return models;
    }
}
