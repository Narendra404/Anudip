import java.util.Scanner;

public class FindWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the word to be searched in '" + str + "' : ");
        String word = sc.next();

        int start = 0;
        int index = 0;

        while (index != -1) {

            index = str.indexOf(word, start);
            if (index != -1) {

                System.out.println();
                System.out.println("The word '" + word + "' is present at the index : " + index);
                start = index + 1;
            }
        }

        System.out.println();
    }
}