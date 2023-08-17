package Misc;

import java.util.*;

class FindCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a string : ");
        String str = sc.next();
        System.out.println();
        System.out.print("Enter the character you wish to find in the above entered string : ");
        char ch = sc.next().charAt(0);
        System.out.println();

        int len = str.length();

        for (int i = 0; i < len; i++) {

            if (ch == str.charAt(i)) {

                System.out.println("The entered character " + ch + " is found at index : " + i);
                System.out.println();
                return;
            }
        }

        System.out.println("The entered character " + ch + " is not in the entered string " + str + ".");
        System.out.println();
    }
}