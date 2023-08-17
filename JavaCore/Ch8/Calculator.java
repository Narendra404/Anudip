package Ch8;

import java.util.*;

public class Calculator {
   public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);
       char flag = 'y';

       while (flag == 'y'){
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            System.out.print("Enter the operator : ");
            char ch = sc.next().charAt(0);

           switch (ch) {
               case '+' -> System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
               case '-' -> System.out.println("Sum of " + a + " and " + b + " is : " + (a - b));
               case '*' -> System.out.println("Sum of " + a + " and " + b + " is : " + (a * b));
               case '/' -> System.out.println("Sum of " + a + " and " + b + " is : " + (a / b));
               case '%' -> System.out.println("Sum of " + a + " and " + b + " is : " + (a % b));
               default -> System.out.println("Wrong choice of operator.");
           }
            System.out.print("Want to calculate again ? (y/n): ");
            flag = sc.next().charAt(0);

        }
    }
}
