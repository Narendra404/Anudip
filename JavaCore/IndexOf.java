import java.util.*;

public class IndexOf {

    String str;
    int length;

    IndexOf(String s) {

        str = s;
        length = s.length();
    }

    int indexOfChar(char ch) {

        int index = -1;

        for (int i = 0; i < length; i++) {

            if (str.charAt(i) == ch) {

                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a string : ");
        String s = sc.next();
        System.out.print("Enter the character whose index is to be found : ");
        char ch = sc.next().charAt(0);

        IndexOf obj = new IndexOf(s);

        System.out.println();
        System.out.println("The character " + ch + " is present at the index " + obj.indexOfChar(ch) + " of the string " + s + ".");
        System.out.println();
    }
}