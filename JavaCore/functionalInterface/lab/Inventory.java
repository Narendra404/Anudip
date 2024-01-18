package functionalInterface.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Create a functional interface called InventoryValuation
@FunctionalInterface
interface InventoryValuation {
    // Create a method called calculateValue that takes one parameter:  a list of Inventory objects
    double calculateValue(List<Inventory> inventory);
}

// Create a class called Inventory
public class Inventory {

    // Create two private instance variables:  item and price
    private String item;
    private Double price;

    // Create a default constructor
    public Inventory() {
        item = null;
        price = null;
    }

    // create a getter method for each instance variable
    public String getItem() {
        return item;
    }

    public Double getPrice() {
        return price;
    }

    // Create a method called inputInventory that takes one parameter:  a Scanner object
    public void inputInventory(Scanner sc) {

        // Prompt the user to enter the name of the item
        System.out.print("\nEnter the name of the item : $");
        item = sc.next();

        // Prompt the user to enter the price of the item
        System.out.print("\nEnter the price of the item : $");
        price = sc.nextDouble();
    }
}

// Create a class called App
class App {
    // Create a main method
    public static void main(String[] args) {

        // Create a Scanner object, a char variable, and a List of Inventory objects
        Scanner sc = new Scanner(System.in);
        char ch;
        List<Inventory> inventory = new ArrayList<>();

        //  Prompt the user to enter the details for the items
        System.out.println("\n\t\tINVENTORY");
        System.out.println("\nEnter the details for the items :");

        //  Create a do-while loop that will continue to prompt the user to enter the details for the items until the user indicates that they are done entering items
        do {

            // Create an instance of the Inventory class
            Inventory var = new Inventory();
            //  Call the inputInventory method on the Inventory object
            var.inputInventory(sc);
            //  Add the Inventory object to the list of Inventory objects
            inventory.add(var);

            //  Prompt the user to enter details for another item
            System.out.print("\nWant to enter details for another item? (y/n) : ");
            ch = sc.next().charAt(0);
        } while (ch != 'n');

        // Create an instance of the InventoryValuation interface using a lambda expression
        InventoryValuation inventoryValuation = (List<Inventory> inventoryList) -> {

            // Create a double variable called sum and initialize it to 0.0
            double sum = 0.0;

            // Create a for-each loop that will iterate through the list of Inventory objects and add the price of each item to the sum
            for (Inventory var : inventoryList) {
                sum += var.getPrice();
            }

            // Return the sum
            return sum;
        };

        //  Display the total valuation of all the items
        System.out.println("\nThe total valuation of all the items is : $" + inventoryValuation.calculateValue(inventory));

        sc.close();
    }
}