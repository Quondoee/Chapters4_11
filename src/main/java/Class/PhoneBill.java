package Class;

import java.util.Scanner;

public class PhoneBill{

    private String id;
    private double planFee;
    private int allottedMinutes;
    private int minutesUsed;

    // Default constructor
    public PhoneBill() {
        this.id = "0000"; // Default ID
        this.planFee = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    // Constructor that accepts ID only
    public PhoneBill(String id) {
        this.id = id;
        this.planFee = 0.0;
        this.allottedMinutes = 0;
        this.minutesUsed = 0;
    }

    // Constructor that accepts all fields
    public PhoneBill(String id, double planFee, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.planFee = planFee;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Method to calculate overage fees
    public double calculateOverageFees() {
        if (minutesUsed > allottedMinutes) {
            return (minutesUsed - allottedMinutes) * 0.25; // 25 cents per extra minute
        }
        return 0.0;
    }

    // Method to calculate tax
    public double calculateTax() {
        double subtotal = planFee + calculateOverageFees();
        return subtotal * 0.15; // 15% tax
    }

    // Method to calculate total
    public double calculateTotal() {
        return planFee + calculateOverageFees() + calculateTax();
    }

    // Method to print an itemized bill
    public void printBill() {
        System.out.println("Phone Bill Statement for ID: " + id);
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + calculateOverageFees());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}


