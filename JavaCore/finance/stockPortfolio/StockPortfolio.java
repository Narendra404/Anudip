package finance.stockPortfolio;

import java.util.Scanner;

public class StockPortfolio
 {
     private Double initialPortfolioValue;
     private Double totalPortfolioValue;
     private Double stockValue;
     private String stockName;
     private Integer numberOfShares;
     private Double purchasePricePerShare;
     private Double marketPricePerShare;
     private Double valueChange;

     public void input(Scanner scanner, int i) {

         // Get stock information from the user
         System.out.println("Enter information for Stock #" + i + ":");
         System.out.print("Enter the stock symbol: ");
         stockName = scanner.next();
         System.out.print("Enter the number of shares: ");
         numberOfShares = scanner.nextInt();
         System.out.print("Enter the purchase price per share: $");
         purchasePricePerShare = scanner.nextDouble();
         System.out.print("Enter the market price per share: $");
         marketPricePerShare = scanner.nextDouble();
     }

     private void calculateStocks() {

         // Calculate the total value for this stock
         stockValue = numberOfShares * marketPricePerShare;
         double initialStockValue = numberOfShares * purchasePricePerShare;
         valueChange = (stockValue > initialStockValue) ? stockValue - initialStockValue : initialStockValue - stockValue;

         // Add the stock value to the total portfolio value
         totalPortfolioValue += stockValue;
         initialPortfolioValue += initialStockValue;
     }

     public void displayStock() {

         calculateStocks();

         // Display the total value for this stock
         System.out.println("Total value for " + stockName + ": $" + stockValue);
         System.out.println("Total value change : " + valueChange);
     }

     public void display() {

         // Display the total portfolio value
         System.out.println("Total portfolio value: $" + totalPortfolioValue);
         System.out.println("Total portfolio change : $" + ((initialPortfolioValue > totalPortfolioValue) ? initialPortfolioValue - totalPortfolioValue : totalPortfolioValue - initialPortfolioValue));
     }
}

class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the number of different stocks in the portfolio
        System.out.print("Enter the number of different stocks in your portfolio: ");
        int numberOfStocks = scanner.nextInt();

        StockPortfolio obj = new StockPortfolio();

        for (int i = 0; i < numberOfStocks; i++) {

            obj.input(scanner, i);
            obj.displayStock();
        }

        obj.display();
        scanner.close();
    }
}