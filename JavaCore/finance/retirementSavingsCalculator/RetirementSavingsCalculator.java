package finance.retirementSavingsCalculator;

import java.util.Scanner;

public class RetirementSavingsCalculator {
    Double currentSavings;
    Double annualInterestRate;
    Integer retirementAge;
    Double retirementGoal;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter your current retirement savings: $");
        currentSavings = scanner.nextDouble();

        System.out.print("Enter your annual interest rate (as a percentage): ");
        annualInterestRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter your retirement age: ");
        retirementAge = scanner.nextInt();

        System.out.print("Enter your desired retirement savings goal: $");
        retirementGoal = scanner.nextDouble();

        scanner.close();
    }

    // Function to calculate monthly savings needed to reach retirement goal
    private double calculateMonthlySavings() {

        int yearsUntilRetirement = retirementAge - getCurrentYear();
        int monthsUntilRetirement = yearsUntilRetirement * 12;

        double monthlyInterestRate = annualInterestRate / 12;
        double futureValue = retirementGoal;
        double presentValue = currentSavings;

        // Use the formula for calculating the monthly payment needed to reach a future value
        return (futureValue - presentValue * Math.pow(1 + monthlyInterestRate, monthsUntilRetirement))
                / ((Math.pow(1 + monthlyInterestRate, monthsUntilRetirement) - 1) * (1 + monthlyInterestRate));
    }

    public void display() {

        // Calculate and display the monthly savings needed
        System.out.println("You need to save $" + calculateMonthlySavings() + " per month to reach your retirement goal.");
    }

    // Function to get the current year
    private int getCurrentYear() {
        return java.time.Year.now().getValue();
    }
}

class App {
    public static void main(String[] args) {

        RetirementSavingsCalculator obj = new RetirementSavingsCalculator();

        obj.input();
        obj.display();
    }
}