package finance.expenseAnalyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExpenseAnalyzer {

    private final List<Category> records;

    public ExpenseAnalyzer() {
        records = new ArrayList<>();
    }

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs for expenses
        while (true) {

            // Initialize variables to store expenses by category
            System.out.println();
            System.out.print("Enter an expense category (or 'done' to finish): ");
            String category = scanner.nextLine().trim();

            if (category.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter the initial expense amount for " + category + ": $");
            double amount = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            records.add(new Category(category, amount));
        }

        System.out.println();
        System.out.println("Enter the new expenses made in each category (one by one) : ");
        System.out.println();

        for (Category var : records) {

            System.out.print("Enter the expense for the category " + var.getName() + " : ");
            var.setAmount(scanner.nextDouble());
        }

        scanner.close();
    }

    private void analyze() {

        Collections.sort(records);
    }

    public void display() {

        analyze();

        double totalExpenses = 0.0;

        // Display the expense analysis
        System.out.println("\nExpense Analysis:");
        System.out.println();

        for (Category var : records) {
            System.out.println(var.getName() + ": $" + var.getAmount() + "\t ~ $" + var.getChange());
            totalExpenses += var.getAmount();
        }

        System.out.println("\nTotal Monthly Expenses: $" + totalExpenses);
    }
}

class Category implements Comparable<Category> {

    private final String name;
    private Double amount;
    private Double change;

    public Category(String name, Double amount) {
        this.name = name;
        this.amount = amount;
        this.change = amount;
    }

    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {

        this.amount = amount;
        this.change = amount - this.change;
    }

    public Double getChange() {
        return change;
    }

    @Override
    public int compareTo(Category o) {
        return (int)(o.getChange() - this.getChange());
    }
}

class App {
    public static void main(String[] args) {

        ExpenseAnalyzer obj = new ExpenseAnalyzer();

        obj.input();
        obj.display();
    }
}