import java.util.*;

public class LCMGCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers whose LCM and GCD is to be found :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;
        int gcd;

        while (x > 0 && y > 0) {

            if (x > y) {
                
                x = x % y;
            }
            else {
                
                y = y % x;
            }
        }

        if (x == 0) {
            
            gcd = y;
        }
        else {
            
            gcd = x;
        }

        System.out.println("The GCD of " + a + " and " + b + " is : " + gcd);
        System.out.println("The LCM of " + a + " and " + b + " is : " + ((a * b) / gcd));
    }
}
