import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the Pattern : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                
                System.out.print(" " + (j + 1));
            }

            System.out.println();
        }
    }
}
