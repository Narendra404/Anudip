package functionalInterface.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Create a functional interface called InventoryFilter
@FunctionalInterface
interface InventoryFilter {
    // Create a method called outOfStock that takes one parameter:  a list of InventoryStorage objects
    List<InventoryStorage> outOfStock(List<InventoryStorage> inventory);
}

// Create a class called InventoryStorage
public class InventoryStorage {

    // Create three private instance variables:  item, stock, and capacity
    private String item;
    private Integer stock;
    private Integer capacity;

    // Create a default constructor
    public InventoryStorage() {
        item = null;
        stock = null;
        capacity = null;
    }

    // create a getter method for each instance variable

    public String getItem() {
        return item;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getCapacity() {
        return capacity;
    }

    // Create a method called inputInventory that takes one parameter:  a Scanner object
    public void inputInventory(Scanner sc) {

        // Prompt the user to enter the name of the item
        System.out.print("\nEnter the name of the item : ");
        item = sc.next();

        // Prompt the user to enter the quantity of the item which is currently in stock
        System.out.print("\nEnter the quantity of the item which is currently in stock : ");
        stock = sc.nextInt();

        // Prompt the user to enter the total capacity for the storage of the item
        System.out.print("\nEnter the total capacity for the storage of the item : ");
        capacity = sc.nextInt();
    }
}

// Create a class called App1
class App1 {
    // Create a main method
    public static void main(String[] args) {

        // Declare variables for a Scanner object, a list of InventoryStorage objects, and a char
        Scanner sc = new Scanner(System.in);
        List<InventoryStorage> inventoryStorage = new ArrayList<>();
        char ch;

        // Display a welcome message
        System.out.println("\n\t\tINVENTORY STORAGE");
        System.out.println("\nEnter the details of the items : ");

        // Create a do-while loop that will loop until the user indicates they are done entering items
        do {

            //  Create an instance of the InventoryStorage class
            InventoryStorage var = new InventoryStorage();
            // Prompt the user to enter the details of the item
            var.inputInventory(sc);
            // Add the InventoryStorage object to the list
            inventoryStorage.add(var);

            // Prompt the user to enter whether they want to add another item
            System.out.print("\nWant to add another item? (y/n) : ");
            ch = sc.next().charAt(0);
        } while (ch != 'n');

        // Create an instance of the InventoryFilter interface using a lambda expression
        InventoryFilter inventoryFilter = (List<InventoryStorage> inventoryStorageList) -> {

            // Create an ArrayList of InventoryStorage objects called filteredList to store items which are out of stock or have reached their point of reorder
            List<InventoryStorage> filteredList = new ArrayList<>();

            //  Create a for-each loop that will iterate through the list of InventoryStorage objects
            for (InventoryStorage var : inventoryStorageList) {

                // If the item is out of stock or has reached its point of reorder, add it to the filteredList
                if ((double) var.getStock() / var.getCapacity() <= 0.20) {
                    filteredList.add(var);
                }
            }

            // Return the filteredList
            return filteredList;
        };

        // Display the list of items which are out of stock or have reached their point of reorder
        System.out.println("\nThe list of items which are out of stock or have reached their point of reorder : ");
        System.out.printf("\n\t%8s%12s%9s\n", "ITEM", "CAPACITY", "STOCK");

        List<InventoryStorage> outOfStockList = inventoryFilter.outOfStock(inventoryStorage);
        for (InventoryStorage var : outOfStockList) {
            System.out.printf("\t%8s%12d%9d", var.getItem(), var.getCapacity(), var.getStock());
        }
    }
}
