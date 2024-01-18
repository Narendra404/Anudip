package exceptionHandling.lab;

import java.util.Scanner;

public class HandlingNumberFormatException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int OFFSET = 5;

        try (scanner) {

            System.out.print("Enter your Anudip Student ID : ");
            String student_id = scanner.next().substring(2);

            int updated_number = Integer.parseInt(student_id) + OFFSET;
            System.out.format("Your new Anudip Student ID : AF%07d\n" , updated_number);

        } catch (NumberFormatException e) {
            System.err.println("The Anudip Student Id if of format : AFxxxxxxx");
            System.err.println("Where the x is a digit.");
        }
    }
}
