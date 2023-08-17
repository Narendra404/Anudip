package Misc;

import java.util.*;

public class CharAt {

    char[] str;

    CharAt(String value) {

        str = value.toCharArray();
    }
    char CharacterAt(int x) {

        try {
            return str[x];
        }
        catch (Exception ignored) {
            return ' ';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a string (one word): ");
        String var = sc.next();
        System.out.print("Enter the index of the character you want to return : ");
        int index = sc.nextInt();

        CharAt ob = new CharAt(var);

        System.out.println("The character at " + index + " index of string " + var + " is : " + ob.CharacterAt(index));

    }
}