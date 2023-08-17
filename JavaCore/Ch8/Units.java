package Ch8;

import java.util.*;

public class Units {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of kWh units of electricity : ");
        int u = sc.nextInt();

        if (u >= 1 && u <= 100) {
            
            System.out.println("The electricity bill : " + (u * 10));
        }
        else if (u >= 100 && u <= 200) {
            
            System.out.println("The electricity bill : " + ((u - 100) * 15 + 1000));
        }
        else if (u >= 200 && u <= 300) {
            
            System.out.println("The electricity bill : " + ((u - 200) * 20 + 2500));
        }
        else if (u > 300) {
            
            System.out.println("The electricity bill : " + ((u - 300) * 25 + 4500));
        }
        else {
            
            System.out.print("The amount of units should be a natural number.");
        }
    }
}
