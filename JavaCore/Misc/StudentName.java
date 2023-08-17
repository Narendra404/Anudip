package Misc;

import java.util.Scanner;

public class StudentName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        System.out.println();

        String[] str = new String[n];

        System.out.println("Enter the names of students one by one : ");

        sc.nextLine();
        for (int i = 0; i < n; i++) {

            str[i] = sc.nextLine();
        }

        System.out.println();
        System.out.print("Enter the name of the student you want to search : ");
        String name = sc.nextLine();

        for (int i = 0; i < n; i++) {

            if (str[i].equals(name)) {

                System.out.println();
                System.out.println("The student named '" + name + "' is found at the index : " + i);
                return;
            }
        }

        System.out.println();
        System.out.println("The student named '" + name + "' is not found in the available list of student names.");
    }
}