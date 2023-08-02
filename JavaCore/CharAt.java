import java.util.*;

public class CharAt {

    char[] str;

    CharAt(char[] a) {

        str = a;
    }
    char CharacterAt(int x) {

        return str[x];
    }

    public static void main(String[] args) {

        char[] ar = "Hello".toCharArray();

        CharAt ob = new CharAt(ar);

        System.out.println("Character at index 2 of 'Hello' : " + ob.CharacterAt(2));

    }
}