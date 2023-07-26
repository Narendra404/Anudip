import java.util.*;
import java.lang.*;

public class Capital {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a line of strings : ");
        String str = sc.nextLine();

        StringBuilder st = new StringBuilder(str);
        st.setCharAt(0, Character.toUpperCase(str.charAt(0)));

        int len = str.length();

        for (int i = 1; i < len; i++) {
            
            if (Character.isWhitespace(str.charAt(i))) {
                
                st.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1)));
            }
        }

        System.out.println();
        System.out.println("The line of strings with each string in Capital letter : " + st);
        System.out.println();
    }
}
