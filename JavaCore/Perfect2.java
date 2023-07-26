import java.util.*;

public class Perfect2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Perfect numbers between 1 to 100000 : ");
        System.out.println();

        for (int i = 1; i <= 100000; i++) {
            
            int sum = 0;

            for (int j = 1; j < i; j++) {
                
                if (i % j == 0) {
                    
                    sum += j;
                }
            }

            if (sum == i) {
                
                System.out.println(i);
            }
        }

        System.out.println();
    }
}
