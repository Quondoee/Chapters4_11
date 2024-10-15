package Class;

public class Pig extends Animal {


    @Override
    public void makeSound() {
        System.out.println("The pig says: Oink!");
    }


    public void rollInMud() {
        System.out.println("The pig is rolling in the mud.");
    }
}