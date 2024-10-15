package Class;

import java.util.Scanner;

public class AvereagetestScores {
    public static void main(String[] args) {


        int numberOfstudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);
        //Process all students
        for (int i = 0; i < numberOfstudents; i++) {

            double total = 0;
            for( int j = 0; j< numberOfTests; j++){ //loop to add test scores to total until we run out of test
                System.out.println("Enter the score of test #" + (j +1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average of student # " + (i+1) + " is " + average);
        }
        scanner.close();
    }
}