package Class;

public class Banana extends Fruit{

    public Banana() {
        this.calorieContent = 105; // Average calories in a banana
    }

    public void removePeel() {
        System.out.println("The banana has been peeled.");
    }

    @Override
    public void prepareJuice() {
        System.out.println("Delicious banana juice is ready.");
    }
}

