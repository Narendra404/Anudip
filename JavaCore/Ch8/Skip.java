import java.util.*;

public class Skip {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to be skipped between 1 to 100 : ");
        int n = sc.nextInt();

        for (int i = 1;i <= 100;i++ ) {
            if (i == n) {
                continue;
            }
            System.out.println(i);
        }
    }
}
