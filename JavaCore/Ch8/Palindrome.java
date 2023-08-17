package Ch8;

import java.util.*;

public class Palindrome {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number : ");
       int n = sc.nextInt();

       int t = n, r = 0;

       while (t > 0) {
           r = (r * 10) + (t % 10);
           t = t / 10;
       }

       if (r == n) {
           System.out.println(n + " is a palindrome number.");
       }
       else {
           System.out.println(n + " is not a palindrome number.");
       }
    }
}
