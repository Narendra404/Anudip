package Ch8;

import java.util.*;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the Prime series : ");
        int n = sc.nextInt();

        System.out.println("The Fibonacci series upto " + n + " is as follows : ");

        for (int i = 1; i <= n; i++) {
            
            int count = 0;
            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    
                    count++;
                }
            }

            if (count == 2) {

                System.out.println(i);
            }
        }
    }
}
