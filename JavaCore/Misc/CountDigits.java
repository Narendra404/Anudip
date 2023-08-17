package Misc;

import java.util.*;
import java.lang.*;

public class CountDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the string whose number of digits is to be counted : ");
        String str = sc.nextLine();

        System.out.println();
        int count = 0;
        int len = str.length();

        for (int i = 0; i < len; i++) {
            
            if (Character.isDigit(str.charAt(i))) {
                
                count++;
            }
        }
        System.out.println();
        System.out.println("The number of digits in the entered string are : " + count);
        System.out.println();
    }
}
