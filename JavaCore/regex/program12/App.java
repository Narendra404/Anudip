package regex.program12;

public class App {
    public static void main(String[] args) {

        String text = "npaul7345@yahoo.com";
        System.out.println(text.matches("\\w+@(gmail|yahoo|outlook|hotmail)\\.(com|in)"));
        String text2 = "1234567890";
        System.out.println(text2.matches("\\d{10}"));
    }
}
