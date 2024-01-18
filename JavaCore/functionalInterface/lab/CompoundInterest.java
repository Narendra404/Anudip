package functionalInterface.lab;

import java.util.Scanner;

// Create a functional interface called FinancialCalculator
@FunctionalInterface
interface FinancialCalculator {
    // Create a method called calculateCI that takes three parameters:  principal amount, rate of interest, and time period
    double calculateCI(double p, double r, double t);
}

// Create a class called CompoundInterest
public class CompoundInterest {
    // Create a main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Get the principal amount, rate of interest, and time period
        System.out.print("\n Enter the principle amount : $");
        double principal = sc.nextDouble();
        System.out.print("\n Enter the rate of interest : ");
        double rateOfInterest = sc.nextDouble();
        System.out.print("\n Enter the time period : ");
        double time = sc.nextDouble();

        // Create an instance of the FinancialCalculator interface using a lambda expression
        FinancialCalculator ci = ((p, r, t) -> (p * Math.pow((1 + r / 100), t) - p));

        // Calculate the compound interest
        double interest = ci.calculateCI(principal, rateOfInterest, time);

        // Display the compound interest and the total amount
        System.out.println("\nThe compound interest is : \t$" + Math.round(interest));
        System.out.println("The total amount is : \t\t$" + Math.round(principal + interest));

        sc.close();
    }
}