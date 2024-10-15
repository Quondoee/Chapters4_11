package Class;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {


        Fruit[] fruitBasket = new Fruit[2];


        fruitBasket[0] = new Apple();
        fruitBasket[1] = new Banana();


        for (Fruit fruit : fruitBasket) {
            fruit.prepareJuice();
            System.out.println("Calorie Content: " + fruit.getCalorieContent());


            if (fruit instanceof Apple) {
                ((Apple) fruit).discardSeeds();
            } else if (fruit instanceof Banana) {
                ((Banana) fruit).removePeel();
            }
        }

//        BirthdayCake myBirthdayCake = new BirthdayCake("Chocolate", 29.99, 12);
//
//
//        System.out.println("Birthday Cake Details:");
//        System.out.println("Flavor: " + myBirthdayCake.getFlavor());
//        System.out.println("Price: $" + myBirthdayCake.getPrice());
//        System.out.println("Number of Candles: " + myBirthdayCake.getCandles());
//
//
//        WeddingCake myWeddingCake = new WeddingCake("Vanilla", 200.00, 5);
//
//
//        System.out.println("\nWedding Cake Details:");
//        System.out.println("Flavor: " + myWeddingCake.getFlavor());
//        System.out.println("Price: $" + myWeddingCake.getPrice());
//        System.out.println("Number of Tiers: " + myWeddingCake.getTiers());



//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter ID for the phone bill: ");
//        String id = scanner.nextLine();
//
//        System.out.print("Enter base cost of the plan: ");
//        double planFee = scanner.nextDouble();
//
//        System.out.print("Enter allotted minutes: ");
//        int allottedMinutes = scanner.nextInt();
//
//        System.out.print("Enter minutes used: ");
//        int minutesUsed = scanner.nextInt();
//
//
//        PhoneBill phoneBill = new PhoneBill(id, planFee, allottedMinutes, minutesUsed);
//
//
//        phoneBill.printBill();
//
//        scanner.close();
    }

}

