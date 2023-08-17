package Misc;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Token {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the delimiter to be used to tokenize the above entered string : ");
        String del = sc.next();

        StringTokenizer s = new StringTokenizer(str, del);

        System.out.println();
        System.out.println("The total number of tokens in '" + str + "' with the delimiter '" + del + "' is : " + s.countTokens());

        System.out.println();
        System.out.println("The tokens of '" + str + "' with the delimiter '" + del + "' are as follows : ");

        while (s.hasMoreTokens()) {

            System.out.println();
            System.out.println(s.nextToken());
        }

        System.out.println();
    }
}