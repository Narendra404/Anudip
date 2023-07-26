import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str, rev = "";

        System.out.print("Enter a String : ");
        str = sc.nextLine();

        int len = str.length();

        for (int i = len - 1;i >= 0;i--) {
            rev += str.charAt(i);
        }

        System.out.print("The reversed String : " + rev);
        System.out.println();
    }
}
