import java.util.*;

public class XavierSchool {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter the marks (out of 100) of subjects English, Maths and Science one by one : ");
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int sci = sc.nextInt();

        if (eng >= 80 && math >= 80 && sci >= 80) {

            System.out.println();
            System.out.println("Eligible for Pure Science.");
            System.out.println();
        }
        else if (eng >= 80 && math >= 60 && sci >= 80) {

            System.out.println();
            System.out.println("Eligible for Bio. Science.");
            System.out.println();
        }
        else if (eng >= 60 && math >= 60 && sci >= 60) {

            System.out.println();
            System.out.println("Eligible for Commerce.");
            System.out.println();
        }
    }
}