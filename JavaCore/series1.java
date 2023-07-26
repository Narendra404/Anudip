import java.util.*;

public class series1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("The series is as follows : ");
        System.out.println();
        System.out.println("sum = x - 1/x + 2/x - 3/x … n/x");
        System.out.println();
        System.out.print("Enter the value of x : ");
        float x = sc.nextFloat();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println();

        float sum = x;
        for (int i = 0; i < n; i++) {
            
            if (i % 2 == 0) {

                sum -= ((i + 1) / x);
            }
            else {
                
                sum += ((i + 1) / x);
            }
        }

        System.out.println();
        System.out.println("The sum of the above series is : " + sum);
        System.out.println();
    }
}
