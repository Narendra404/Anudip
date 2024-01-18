package functionalInterface.lab;

import java.util.Scanner;

// Create a functional interface called ConvertCurrency
@FunctionalInterface
interface ConvertCurrency {
    // Create a method called convert that takes two parameters:
    double convert(double rate, double value);
}

// Create a class called CurrencyConvertor
public class CurrencyConvertor {
    // Create a main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the amount of money to be converted
        System.out.print("\nEnter the amount of money to be converted : $");
        double amount =  sc.nextDouble();
        //  Get the rate of conversion to the targeted currency
        System.out.print("\nEnter the rate of conversion to the targeted currency : ");
        double rate = sc.nextDouble();

        // Create an instance of the ConvertCurrency interface using a lambda expression
        ConvertCurrency convertCurrency = ((r, v) -> (r * v));

        // Convert the amount of money to the targeted currency
        System.out.println("\nThe converted value in the targeted currency is : " + convertCurrency.convert(rate, amount));

        sc.close();
    }
}
