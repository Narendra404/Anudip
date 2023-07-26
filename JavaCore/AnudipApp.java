import java.util.*;
import java.lang.*;

public class AnudipApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();

        if (args.length == 0) {
            
            System.out.println("Usage : java AnudipApp <Anudip ID>");
            System.out.println();
            return;
        }
        else {

            if (args[0].length() == 9) {
                
                if (args[0].charAt(0) == 'A' && args[0].charAt(1) == 'F') {
                    
                    for (int i = 2; i < 9; i++) {
                        
                        if (! Character.isDigit(args[0].charAt(i))) {

                            System.out.println("The entered ID is not an Anudip verified ID.");
                            System.out.println("The ID is not a 7 digit number after 'AF'.");
                            System.out.println("Access Denied.");
                            System.out.println();
                            return;
                        }
                    }

                    System.out.println("The entered ID is an Anudip verified ID.");
                    System.out.println("Welcome.");
                }
                else {
                    
                    System.out.println("The entered ID is not an Anudip verified ID.");
                    System.out.println("The ID does not start with 'AF'.");
                    System.out.println("Access Denied.");
                }
            }
            else {
                    
                System.out.println("The entered ID is not an Anudip verified ID.");
                System.out.println("The ID is too short.");
                System.out.println("Access Denied.");
            }
        }

        System.out.println();
    }
}
