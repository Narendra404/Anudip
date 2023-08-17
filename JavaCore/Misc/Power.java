package Misc;

import java.util.*;

public class Power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the value of base : ");
        float a = sc.nextFloat();
        System.out.println();
        System.out.print("Enter the value of exponent : ");
        float x = sc.nextFloat();

        float p = (float)Math.pow(a, x);

        System.out.println();
        System.out.println("The value of " + a + " raised to " + x + " is : " + p);
        System.out.println();
    }
}
