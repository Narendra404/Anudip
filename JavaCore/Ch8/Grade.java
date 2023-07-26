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
            
            case 0 :
            case 1 :
            case 2 :
            case 3 :
                System.out.println("The student has obtained a FAIL grade.");
                break;
                
            case 4 :
            case 5 :
            case 6 :
                System.out.println("The student has obtained a PASS grade.");
                break;

            case 7 :
                System.out.println("The student has obtained a PASS grade with THIRD CLASS.");
                break;

            case 8 :
                System.out.println("The student has obtained a PASS grade with SECOND CLASS.");
                break;

            case 9 :
                System.out.println("The student has obtained a PASS grade with FIRST CLASS.");
                break;

            case 10 :
                System.out.println("The student has obtained a PASS grade with FIRST CLASS DISTINCTION.");
                break;
        }
    }
}
