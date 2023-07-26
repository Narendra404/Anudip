import java.util.*;

public class Largest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println();
        System.out.println("The largest of " + a + ", " + b + " and " + c + " is " + max);
        System.out.println();
    }
}
