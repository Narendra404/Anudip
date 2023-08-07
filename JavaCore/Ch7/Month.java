package Ch7;

import java.util.*;

public class Month {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter a number between 1 to 12 in the following prompt. ");

        int n;

        do {

            System.out.print("Enter the number : ");
            n = sc.nextInt();
        }
        while (n < 1 || n > 12);

        System.out.println("The name of the month corresponding to the entered number : ");

        // Replace classic switch with enhanced switch
        switch (n) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}