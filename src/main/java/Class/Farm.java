package Class;

public class Farm {
    public static void main(String[] args) {

        Animal myPig = new Pig();
        Animal myDuck = new Duck();


        System.out.println("Pig:");
        myPig.makeSound(); // Calls the overridden method
        myPig.eat();       // Calls the non-abstract method
        ((Pig) myPig).rollInMud(); // Calls the specific method

       // Then repeat previous for duck methods
        System.out.println("\nDuck:");
        myDuck.makeSound();
        myDuck.eat();
        ((Duck) myDuck).swim();
    }
}
