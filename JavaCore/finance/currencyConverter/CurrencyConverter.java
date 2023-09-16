package finance.currencyConverter;

import java.util.Scanner;

public class CurrencyConverter {

    private Double exchangeRate;
    private Double amountToConvert;

    public void input() {

        Scanner scanner = new Scanner(System.in);

        // Get the exchange rate from the user
        System.out.print("Enter the exchange rate (from source to target currency): ");
        exchangeRate = scanner.nextDouble();

        // Get the amount to be converted
        System.out.print("Enter the amount to be converted: ");
        amountToConvert = scanner.nextDouble();

        scanner.close();
    }

    private double convertCurrency() {

        // Calculate the converted amount
        return amountToConvert * exchangeRate;
    }

    public void display() {

        // Display the result
        System.out.println("Converted amount: " + convertCurrency() + " (target currency)");
    }
}

class App {
    public static void main(String[] args) {

        CurrencyConverter obj = new CurrencyConverter();

        obj.input();
        obj.display();
    }
}