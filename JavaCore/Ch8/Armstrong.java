package Ch8;

import java.util.*;

public class Armstrong {
   public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number to check for Armstrong number : ");
       int n = sc.nextInt();

       int t = n, sum = 0, no_of_digits = 0;

       while (t > 0) {
           t = t / 10;
           no_of_digits++;
       }
        
       t = n;
       while (t > 0) {
           sum += (int)Math.pow((t % 10), no_of_digits);
           t = t / 10;
       }

       if (n == sum) {
           System.out.println("The number "+ n + " is a Armstrong number.");
       }
       else {
           System.out.println("The number "+ n + " is not a Armstrong number.");
       }
    }
}
