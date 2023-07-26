import java.util.*;

public class Menu {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Welcome to out Restaurant");
       char ch = 'y';
       int bill = 0;
       while (ch == 'y'){
         System.out.println("Please select any of the following from the list :");
         System.out.println("\tItem\t Price\t Choice");
         System.out.println("\tDosa\t 100\t 1");
         System.out.println("\tChicken\t 200\t 2");
         System.out.println("\tBiryani\t 150\t 3");
         System.out.println("\tBurgur\t 150\t 4");
         System.out.println("\tFries\t 100\t 5");
         System.out.println("Enter your choice and Quantity:");
         int item = sc.nextInt();
         int quant = sc.nextInt();
         switch (item) {
             case 1: 
                 System.out.println("Dosa selected");
                 System.out.println("Price : 100\t Quantity : "+ quant);
                 bill += 100 * quant;
                 System.out.println("Total current bill : "+ bill);
             break;

             case 2: 
                 System.out.println("Chicken selected");
                 System.out.println("Price : 200\t Quantity : "+ quant);
                 bill += 200 * quant;
                 System.out.println("Total current bill : "+ bill);
             break;

             case 3: 
                 System.out.println("Biryani selected");
                 System.out.println("Price : 150\t Quantity : "+ quant);
                 bill += 150 * quant;
                 System.out.println("Total current bill : "+ bill);
             break;

             case 4: 
                 System.out.println("Matter Paneer selected");
                 System.out.println("Price : 150\t Quantity : "+ quant);
                 bill += 150 * quant;
                 System.out.println("Total current bill : "+ bill);
             break;
             
             case 5: 
                 System.out.println("Vada Pao selected");
                 System.out.println("Price : 100\t Quantity : "+ quant);
                 bill += 100 * quant;
                 System.out.println("Total current bill : "+ bill);
             break;

             default:
                 System.out.println("Wrong Choice selected");
             break;
         }

         System.out.println("Want to add another item (y/n) :");
         ch = sc.next().charAt(0);
       }
       System.out.println("Total Bill : "+ bill);
    }
}
