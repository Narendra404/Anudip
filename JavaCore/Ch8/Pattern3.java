package Ch8;

import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
     
       System.out.print("Enter the height of the pattern : ");
       int n = sc. nextInt();

       for (int i = 0;i < n ; i++ ) {

           for (int k = i; k >= 0 ; k-- ) {
               System.out.print("* ");
           }

           for (int j = (2 * n) - (2 * i) - 2; j > 0 ; j-- ) {
               System.out.print("  ");
           }

           for (int k = i; k >= 0 ; k-- ) {
               System.out.print("* ");
           }
           System.out.println();
        }

       for (int i = n - 1; i > 0 ; i-- ) {

           for (int k = i; k > 0 ; k-- ) {
               System.out.print("* ");
           }

           for (int j = (2 * n) - (2 * i); j > 0 ; j-- ) {
               System.out.print("  ");
           }

           for (int k = i; k > 0 ; k-- ) {
               System.out.print("* ");
           }
           System.out.println();
        }
           

    }
}
