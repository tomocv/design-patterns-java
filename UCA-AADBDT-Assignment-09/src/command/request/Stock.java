package command.request;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buying " + quantity + " of " + name + " stocks!");
    }

    public void sell() {
        System.out.println("Selling " + quantity + " of " + name + " stocks!");
    }
}
