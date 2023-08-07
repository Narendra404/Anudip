package Ch7;

import java.util.*;

public class Money {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the amount of money : ");
        int money = sc.nextInt();

        int[] notes = {2000, 500, 100, 50, 20, 10, 5};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {

            count[i] = money / notes[i];
            money = money % notes[i];
        }

        System.out.println();
        System.out.format("%15s %15s", "Types of notes", "No. of notes");
        System.out.println();

        for (int i = 0; i < notes.length; i++) {

            System.out.println();
            System.out.format("%15s %15s", notes[i], count[i]);
        }

        System.out.println();
    }
}