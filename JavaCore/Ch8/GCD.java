package Ch8;

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers whose GCD is to be found : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);

        while (min > 0) {
            
            if (a % min == 0 && b % min == 0) {
                break;
            }
            
            min--;
        }

        System.out.println("The GCD of " + a + " and " + b + " is : " + min);
    }
}
