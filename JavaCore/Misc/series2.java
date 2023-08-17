package Misc;

import java.util.*;

public class series2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("The series is as follows : ");
        System.out.println();
        System.out.println("sum = 1! + 2! + 3! + ... + n!");
        System.out.println();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            
            long fact = 1;
            int t = i;

            while (t > 1) {

                fact = fact * t;
                t--;
            }

            sum += fact;
        }

        System.out.println();
        System.out.println("The sum of the above series is : " + sum);
        System.out.println();
    }
}
