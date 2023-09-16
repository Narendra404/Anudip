package finance.budgetTracker;

import java.util.Scanner;

public class BudgetTracker {
    private Double monthlyIncome;
    private Double monthlyExpenses;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs for income and expenses
        System.out.print("Enter your monthly income: $");
         monthlyIncome = scanner.nextDouble();

        System.out.print("Enter your total monthly expenses: $");
     monthlyExpenses = scanner.nextDouble();

        scanner.close();
    }

    // Calculate the budget surplus (income - expenses)
    private double calculateBudgetSurplus() {
        return monthlyIncome - monthlyExpenses;
    }

    public void display() {

        double budgetSurplus = calculateBudgetSurplus();

        // Determine whether the user is saving or overspending
        if (budgetSurplus > 0) {
            System.out.println("You are saving money. Your budget surplus is $" + budgetSurplus);
        } else if (budgetSurplus < 0) {
            System.out.println("You are overspending. Your budget deficit is $" + Math.abs(budgetSurplus));
        } else {
            System.out.println("You are breaking even. Your income equals your expenses.");
        }
    }
}

class App {
    public static void main(String[] args) {

        BudgetTracker obj = new BudgetTracker();

        obj.input();
        obj.display();
    }
}