package collectionsProg.searching;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // create a list with names
        List<String> list = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        // check whether charlie is in the list of the names
        System.out.println();
        if (list.contains("Charlie")) System.out.println("The element 'Charlie' is present.");
        else System.out.println("The element 'Charlie' is not present.");
    }
}
