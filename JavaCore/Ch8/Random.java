package Ch8;

import java.util.*;

public class Random {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int n = (int)(Math.random() * 101);
        int a;

        do {

            System.out.println();
            System.out.print("Guess a number between 0 and 100 : ");
            a = sc.nextInt();

            if (a > n) {
                
                System.out.println();
                System.out.println("The number entered " + a + ", is too big.");
            }
            
            if (a < n) {
                
                System.out.println();
                System.out.println("The number entered " + a + ", is too small.");
            }
        }
        while (a != n);

        System.out.println();
        System.out.println("The number entered " + a + ", is the correct number.");
    }
}
