public class Chain {
    private Shop[] Allshops;

    public Chain() {
        this.Allshops = new Shop[50];
    }

    public int getStockValue()
    {
        int sum = 0;

        for (Shop shop : Allshops) {
            sum += shop.getValue();
        }

        return sum;
    }
}
