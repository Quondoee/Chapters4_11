package Class;

public class BirthdayCake extends Cake {
    private int numberOfCandles;


    public BirthdayCake(String flavor, double price, int candles) {
        super(flavor, price);
        this.numberOfCandles = candles;
    }

    public int getCandles() {
        return numberOfCandles;
    }

    public void setCandles(int candles) {
        this.numberOfCandles = candles;
    }
}

