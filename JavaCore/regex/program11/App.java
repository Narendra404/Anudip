package regex.program11;

public class App {
    public static void main(String[] args) {

        String text = "   Hello     World   ";
        System.out.println(text.replaceAll("\\s{2,}", " "));
    }
}
