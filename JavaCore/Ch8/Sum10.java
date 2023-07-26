import java.util.*;

public class Sum10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 number : ");

        int n, sum = 0;

        for (int i = 0; i < 10; i++) {

            n = sc.nextInt();
            sum += n;
        }

        System.out.println("Sum of the 10 numbers are : "+ sum);
        
    }
}
