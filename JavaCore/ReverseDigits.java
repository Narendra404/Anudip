import java.util.*;

public class ReverseDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the number whose digits are to be reversed : ");
        int n = sc.nextInt();

        int t = n, r = 0;

        while (t > 0) {
            
            r = (r * 10) + (t  % 10);
            t = t / 10;
        }

        System.out.println();
        System.out.println("Enter the number with reversed digits : " + r);
        System.out.println();
    }
}
