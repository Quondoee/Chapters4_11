package Class;

public class Cake {
    private String cakeFlavor;
    private double cakePrice;


    public Cake(String flavor, double price) {
        this.cakeFlavor = flavor;
        this.cakePrice = price;
    }


    public String getFlavor() {
        return cakeFlavor;
    }


    public void setFlavor(String flavor) {
        this.cakeFlavor = flavor;
    }


    public double getPrice() {
        return cakePrice;
    }


    public void setPrice(double price) {
        this.cakePrice = price;
    }
}

