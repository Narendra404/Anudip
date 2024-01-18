package Misc;

public class App {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Anudip is an institute. We learn there.");

        String strByDot[] = str.toString().split("\\.");

        for (String temp : strByDot) {
            System.out.println(temp);
        }

    }
}
