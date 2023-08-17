package Ch8;

import java.util.*;

public class Metro {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println();
       System.out.println("\t\tWelcome to MGRoad Metro Station");
       System.out.println();
       char ch = 'y';
       int bill = 0;
       int price = 0;
         System.out.println("Please select your destination from the following from the list :");
         System.out.println();
         System.out.println("\tStation\t Price\t Choice");
         System.out.println();
         System.out.println("\tIffcoChowk\t 50\t 1");
         System.out.println("\tHUDA\t\t 100\t 2");
         System.out.println("\tSikandarpur\t 50\t 3");
         System.out.println("\tArjangard\t 150\t 4");
         System.out.println("\tJorBagh\t\t 200\t 5");
         System.out.println("\tNewDelhi\t 250\t 6");
         System.out.println();
         System.out.print("Enter your destination and No of tickets : ");
         int dest = sc.nextInt();
         int noOfTkts = sc.nextInt();

         System.out.println();
       switch (dest) {
           case 1 -> {
               System.out.println("IffcoChowk selected");
               System.out.println("Price : 50\t No of tickets : " + noOfTkts);
               price += 50 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           case 2 -> {
               System.out.println("HUDA selected");
               System.out.println("Price : 100\t No of tickets : " + noOfTkts);
               price += 100 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           case 3 -> {
               System.out.println("Sikandarpur selected");
               System.out.println("Price : 50\t No of tickets : " + noOfTkts);
               price += 50 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           case 4 -> {
               System.out.println("Arjangard selected");
               System.out.println("Price : 150\t No of tickets : " + noOfTkts);
               price += 150 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           case 5 -> {
               System.out.println("JorBagh selected");
               System.out.println("Price : 200\t No of tickets : " + noOfTkts);
               price += 200 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           case 6 -> {
               System.out.println("NewDelhi selected");
               System.out.println("Price : 250\t No of tickets : " + noOfTkts);
               price += 250 * noOfTkts;
               System.out.println("Total current price : " + price);
           }
           default -> System.out.println("Wrong destination selected");
       }


     while (ch == 'y'){
         System.out.println();
         System.out.println("\t\tMetro Food Service");
         System.out.println();
         System.out.println("Please select any of the following from the list :");
         System.out.println();
         System.out.println("\tItem\t Price\t Choice");
         System.out.println();
         System.out.println("\tDosa\t 100\t 1");
         System.out.println("\tChicken\t 200\t 2");
         System.out.println("\tBiryani\t 150\t 3");
         System.out.println("\tBurgur\t 150\t 4");
         System.out.println("\tFries\t 100\t 5");
         System.out.println();
         System.out.print("Enter your choice and Quantity : ");
         int item = sc.nextInt();
         int quant = sc.nextInt();
         switch (item) {
             case 1 -> {
                 System.out.println("Dosa selected");
                 System.out.println("Price : 100\t Quantity : " + quant);
                 bill += 100 * quant;
                 System.out.println("Total current bill : " + bill);
             }
             case 2 -> {
                 System.out.println("Chicken selected");
                 System.out.println("Price : 200\t Quantity : " + quant);
                 bill += 200 * quant;
                 System.out.println("Total current bill : " + bill);
             }
             case 3 -> {
                 System.out.println("Biryani selected");
                 System.out.println("Price : 150\t Quantity : " + quant);
                 bill += 150 * quant;
                 System.out.println("Total current bill : " + bill);
             }
             case 4 -> {
                 System.out.println("Matter Paneer selected");
                 System.out.println("Price : 150\t Quantity : " + quant);
                 bill += 150 * quant;
                 System.out.println("Total current bill : " + bill);
             }
             case 5 -> {
                 System.out.println("Vada Pao selected");
                 System.out.println("Price : 100\t Quantity : " + quant);
                 bill += 100 * quant;
                 System.out.println("Total current bill : " + bill);
             }
             default -> System.out.println("Wrong Choice selected");
         }

         System.out.println();
         System.out.println("Want to add another item (y/n) :");
         ch = sc.next().charAt(0);
       }
       System.out.println();
       System.out.println("\t\tTotal Bill");
       System.out.println("\tMetro Price :\t" + price);
       System.out.println("\tFood Bill :\t" + bill);
       System.out.println("\tTotal :\t\t" + (bill + price));
    }
}
