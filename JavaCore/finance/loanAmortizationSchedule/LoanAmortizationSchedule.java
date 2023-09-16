package finance.loanAmortizationSchedule;

import java.util.Scanner;

public class LoanAmortizationSchedule {
    private Double loanAmount;
    private Double annualInterestRate;
    private Integer loanDurationYears;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the loan amount: $");
        loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        annualInterestRate = scanner.nextDouble() / 100.0;

        System.out.print("Enter the loan duration (in years): ");
        loanDurationYears = scanner.nextInt();

        scanner.close();
    }

    private void calculate(double monthlyInterestRate, double numberOfPayments, double monthlyPayment) {

        // Calculate and display each month's payment details
        double remainingBalance = loanAmount;
        for (int month = 1; month <= numberOfPayments; month++) {
            double interestPayment = remainingBalance * monthlyInterestRate;
            double principalPayment = monthlyPayment - interestPayment;

            // Update the remaining balance
            remainingBalance -= principalPayment;

            System.out.printf("%d\t$%.2f\t\t$%.2f\t\t$%.2f\t\t$%.2f%n",
                    month, monthlyPayment, principalPayment, interestPayment, remainingBalance);
        }
    }

    public void display() {

        // Calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate the number of monthly payments
        int numberOfPayments = loanDurationYears * 12;

        // Calculate the monthly payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Display the header of the amortization schedule
        System.out.println("\nAmortization Schedule:");
        System.out.println("Month\tPayment\t\tPrincipal\tInterest\tRemaining Balance");

        calculate(monthlyInterestRate, numberOfPayments, monthlyPayment);
    }
}

class App {
    public static void main(String[] args) {

        LoanAmortizationSchedule obj = new LoanAmortizationSchedule();

        obj.input();
        obj.display();
    }
}