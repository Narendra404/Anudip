import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which its factorial is to be found : ");
        int n = sc.nextInt();

        long fact = 1;
        int t = n;

        while (t > 1) {

            fact = fact * t;
            t--;
        }

        System.out.println("The factorial of " + n + " is : " + fact);
    }
}
