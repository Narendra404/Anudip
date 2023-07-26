import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the height of the pattern : ");
       int n = sc. nextInt();

       for (int i = 0;i < n ; i++ ) {

           for (int k = 0; k <= i ; k ++) {
               System.out.print((k + 1) + " ");
           }

               System.out.println();
        }
    }
}
