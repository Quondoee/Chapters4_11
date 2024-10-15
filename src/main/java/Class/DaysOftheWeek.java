package Class;

import java.util.Scanner;

public class DaysOftheWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) for the day of the week: ");

        int dayNumber = scanner.nextInt();


        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("The day of the week is: " + days[dayNumber - 1]);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close(); // Close the scanner
    }
}

