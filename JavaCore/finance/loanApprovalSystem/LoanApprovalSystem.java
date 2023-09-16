package finance.loanApprovalSystem;

import java.util.Scanner;

public class LoanApprovalSystem {

    private Integer creditScore;
    private final Integer minimumCreditScore;
    private Double annualIncome;
    private final Double minimumIncome;
    private Double loanAmount;
    private final Double maximumLoanAmount;

    public LoanApprovalSystem() {

        creditScore = 0;
        annualIncome = 0.0;
        loanAmount = 0.0;

        minimumCreditScore = 650;
        minimumIncome = 25000.0;
        maximumLoanAmount = 100000.0;
    }

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user's credit score
        System.out.print("Enter your credit score (0-850): ");
        creditScore = scanner.nextInt();

        // Get user's annual income
        System.out.print("Enter your annual income: ");
        annualIncome = scanner.nextDouble();

        // Get the loan amount requested
        System.out.print("Enter the loan amount requested: ");
        loanAmount = scanner.nextDouble();

        scanner.close();
    }

    // method which return true or false based on approval of the loan
    private boolean approveLoan() {

        // Check if the user meets the criteria for loan approval
        return  (creditScore >= minimumCreditScore && annualIncome >= minimumIncome && loanAmount <= maximumLoanAmount);
    }

    // method to display the result
    public void display() {

        if (approveLoan()) {
            System.out.println("Your loan is approved.");
        }
        else {
            System.out.println("Your loan is denied.");
        }
    }
}

class App {
    // main method
    public static void main(String[] args) {

        // creating object of the class to call the methods
        LoanApprovalSystem obj = new LoanApprovalSystem();

        // calling the methods
        obj.input();
        obj.display();
    }
}