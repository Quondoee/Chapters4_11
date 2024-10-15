package Class;

public class Duck extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The duck says: Quack!");
    }

    public void swim() {
        System.out.println("The duck is swimming in the pond.");
    }
}