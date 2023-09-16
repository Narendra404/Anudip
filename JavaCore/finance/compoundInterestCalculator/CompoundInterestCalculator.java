package finance.compoundInterestCalculator;

import java.util.Scanner;

public class CompoundInterestCalculator {
    private Double principal;
    private Double annualInterestRate;
    private Integer years;
    private Integer compoundingFrequency;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the principal amount: $");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        System.out.print("Enter the compounding frequency (e.g., 12 for monthly, 4 for quarterly): ");
        compoundingFrequency = scanner.nextInt();

        scanner.close();
    }

    // Function to calculate compound interest
    private double calculateCompoundInterest() {
        return principal * Math.pow(1 + annualInterestRate / compoundingFrequency, years * compoundingFrequency) - principal;
    }

    public void display() {

        // Calculate and display the compound interest
        double compoundInterest = calculateCompoundInterest();
        double totalAmount = principal + compoundInterest;

        System.out.printf("The compound interest earned over %d years is: $%.2f%n", years, compoundInterest);
        System.out.printf("The total amount after %d years is: $%.2f%n", years, totalAmount);
    }
}

class App {
    public static void main(String[] args) {

        CompoundInterestCalculator obj = new CompoundInterestCalculator();

        obj.input();
        obj.display();
    }
}