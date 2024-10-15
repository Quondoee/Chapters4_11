package Class;

import java.util.Random;
import java.util.Scanner;

public class RollTheDie {


    public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int position = 0; // Starting position
            int rolls = 5;    // Total number of rolls

            System.out.println("Welcome to the Dice Game! You need to reach exactly 20 spaces in 5 rolls.");

            for (int i = 1; i <= rolls; i++) {

                int die = random.nextInt(6) + 1;
                position = position + die;


                if (position > 20) {// here we are checking if position is greater than 20
                    System.out.println("Roll #" + i + ": You've rolled a " + die + ". You advanced to space " + position + ". That's too far! You lose.");
                    return;
                }


                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + position +
                        " and have " + (20 - position) + " more to go.");


                if (position == 20) {
                    System.out.println("Congrats, you win!");
                    return;
                }
            }


            if (position < 20) {
                System.out.println("You ended on space " + position + ". Sorry, you lose!");
            }

            scanner.close();
        }
    }


