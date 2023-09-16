package finance.incomeTaxCalculator;

import java.util.Scanner;

public class IncomeTaxCalculator {
    Double annualIncome;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter your annual income: $");
        annualIncome = scanner.nextDouble();

        scanner.close();
    }

    // Function to calculate income tax (simplified for demonstration)
    private double calculateIncomeTax(double annualIncome) {
        double taxRate;

        // Apply a simplified tax rate based on income ranges
        if (annualIncome <= 50000) {
            taxRate = 0.1; // 10% tax rate
        } else if (annualIncome <= 100000) {
            taxRate = 0.15; // 15% tax rate
        } else {
            taxRate = 0.2; // 20% tax rate
        }

        // Calculate income tax
        return annualIncome * taxRate;
    }

    public void display() {

        // Display the calculated income tax
        System.out.printf("Your income tax is: $%.2f%n", calculateIncomeTax(annualIncome));
    }
}

class App {
    public static void main(String[] args) {

        IncomeTaxCalculator obj = new IncomeTaxCalculator();

        obj.input();
        obj.display();
    }
}