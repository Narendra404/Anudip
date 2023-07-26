import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit for the Fibonacci series : ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = a + b;

        System.out.println("The Fibonacci series upto " + n + " is as follows : ");

        while (c <= n) {

            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}
