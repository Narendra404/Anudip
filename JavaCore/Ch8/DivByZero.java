import java.util.*;

public class DivByZero {
   public static void main (String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the dividend : ");
       int a = sc.nextInt();
       System.out.print("Enter the divisor : ");
       int b = sc.nextInt();
       
       try {
           System.out.println("Division of "+ a +" by "+ b + " is : "+ (a / b));

       } catch(Exception e) {
           System.out.println("Division by Zero is not allowed.");
       }
    }
}
