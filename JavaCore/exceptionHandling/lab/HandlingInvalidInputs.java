package exceptionHandling.lab;

import java.util.Scanner;

public class HandlingInvalidInputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int financialData;

        do {
            System.out.print("Enter your Account number: ");
            try {
                financialData = Integer.parseInt(scanner.next());
                System.out.println("Your Account number is: " + financialData);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        } while (true);
    }
}
