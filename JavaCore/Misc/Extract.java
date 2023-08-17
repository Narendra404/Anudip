package Misc;

import java.util.*;
import java.lang.*;

public class Extract {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a String containing alphabets, digits and other special symbols : ");
        String str = sc.next();

        StringBuilder res = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            
            if (Character.isAlphabetic(str.charAt(i))) {
                
                res.append(str.charAt(i));
            }
        }
        
        System.out.println();
        System.out.println("The string with only alphabets extracted from it is : " + res);
        System.out.println();
    }
}
