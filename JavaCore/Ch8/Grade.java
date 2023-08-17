package Ch8;

import java.util.*;

public class Grade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 3 subjects of a student : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b + c;

        System.out.println("The total marks of the student is : " + total);

        switch ((total / 3) / 10) {
            case 0, 1, 2, 3 -> System.out.println("The student has obtained a FAIL grade.");
            case 4, 5, 6 -> System.out.println("The student has obtained a PASS grade.");
            case 7 -> System.out.println("The student has obtained a PASS grade with THIRD CLASS.");
            case 8 -> System.out.println("The student has obtained a PASS grade with SECOND CLASS.");
            case 9 -> System.out.println("The student has obtained a PASS grade with FIRST CLASS.");
            case 10 -> System.out.println("The student has obtained a PASS grade with FIRST CLASS DISTINCTION.");
        }
    }
}
