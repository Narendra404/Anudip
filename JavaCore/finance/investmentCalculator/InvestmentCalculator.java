package finance.investmentCalculator;

import java.util.Scanner;

public class InvestmentCalculator {

    private Double initialInvestment;
    private Double annualInterestRate;
    private Integer years;

    public InvestmentCalculator() {
    }

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get the initial investment amount
        System.out.print("Enter the initial investment amount: $");
        initialInvestment = scanner.nextDouble();

        // Get the annual interest rate
        System.out.print("Enter the annual interest rate (as a percentage): ");
        annualInterestRate = scanner.nextDouble();

        // Get the time period (in years)
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        scanner.close();
    }

    private Double calculateInvestment() {

        // Convert the annual interest rate to a monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate the future value using the compound interest formula
        return initialInvestment * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public void display() {

        // Display the future value
        System.out.println("Future Value: $" + calculateInvestment());
    }
}

class App {
    public static void main(String[] args) {

        InvestmentCalculator obj = new InvestmentCalculator();

        obj.input();
        obj.display();
    }
}