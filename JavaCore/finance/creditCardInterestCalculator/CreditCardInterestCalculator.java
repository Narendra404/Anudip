package finance.creditCardInterestCalculator;

import java.util.Scanner;

public class CreditCardInterestCalculator {
    private Double balance;
    private Double monthlyPayment;
    private Integer months;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get the credit card balance from the user
        System.out.print("Enter the credit card balance: $");
        balance = scanner.nextDouble();

        // Get the monthly payment from the user
        System.out.print("Enter the monthly payment: $");
        monthlyPayment = scanner.nextDouble();

        // Get the number of months to calculate interest for
        System.out.print("Enter the number of months to calculate interest: ");
        months = scanner.nextInt();

        scanner.close();
    }

    private Double calculateCreditCardInterest() {

        double totalInterestPaid = 0.0;

        // Calculate and display the total interest paid
        for (int i = 1; i <= months; i++) {
            // Calculate monthly interest
            double monthlyInterestRate = 0.12;
            double interestPayment = balance * monthlyInterestRate;

            // Update the balance after making the monthly payment
            balance -= monthlyPayment;

            // Add the interest payment to the total interest paid
            totalInterestPaid += interestPayment;

            // Check if the balance is fully paid off
            if (balance <= 0) {
                months = i;
                break;
            }
        }

        return totalInterestPaid;
    }

    public void display() {

        System.out.println("Total interest paid: $" + calculateCreditCardInterest());
        System.out.println("Balance: $" + balance);
        System.out.println("Duration (months): " + months);
    }
}

class App {
    public static void main(String[] args) {

        CreditCardInterestCalculator obj = new CreditCardInterestCalculator();

        obj.input();
        obj.display();
    }
}