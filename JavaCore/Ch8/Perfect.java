import java.util.*;

public class Perfect {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            
            if (n % i == 0) {

                sum += i;
            }
        }

        if (sum == n) {
            
            System.out.println("The number " + n + ", is a Perfect number.");
        }
        else {
            
            System.out.println("The number " + n + ", is not a Perfect number.");
        }
    }
}
