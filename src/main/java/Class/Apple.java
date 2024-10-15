package Class;

public class Apple extends Fruit {

    public Apple() {
        this.calorieContent = 95; // Average calories in an apple
    }


    public void discardSeeds() {
        System.out.println("Seeds have been discarded from the apple.");
    }


    @Override
    public void prepareJuice() {
        System.out.println("Fresh apple juice is ready.");
    }
}

