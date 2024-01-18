package functionalInterface.lab;

import java.util.Scanner;

// Create a functional interface called InvestmentCalculator
@FunctionalInterface
interface InvestmentCalculator {
    // Create a method called calculateInvestment that takes three parameters:
    // initial investment amount, annual interest rate, and number of years
   double calculateInvestment(double i, double r, double y);
}

// Create a class called Investment
public class Investment {
    // Create a main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the initial investment amount
        System.out.print("\nEnter the initial investment amount: $");
        double initialInvestment = scanner.nextDouble();

        // Get the annual interest rate
        System.out.print("\nEnter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Get the time period (in years)
        System.out.print("\nEnter the number of years: ");
        double years = scanner.nextInt();

        // Create an instance of the InvestmentCalculator interface using a lambda expression
        InvestmentCalculator investmentCalculator = (i, r, y) -> {

            // Convert the annual interest rate to a monthly interest rate
            double mr = (r / 100) / 12;

            // Calculate the future value using the compound interest formula
            return i * Math.pow(1 + mr, y * 12);
        };

        // Calculate the future value
        double futureValue = investmentCalculator.calculateInvestment(initialInvestment, annualInterestRate, years);
        // Display the future value
        System.out.println("\nFuture Value: $" + Math.round(futureValue));

        scanner.close();
    }
}
