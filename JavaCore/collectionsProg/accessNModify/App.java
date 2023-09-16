package collectionsProg.accessNModify;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // create list
        List<String> list = new ArrayList<>();

        // add elements
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // replace element
        list.set(1, "grape");

        // display elements of list
        System.out.println();
        for (String var : list) System.out.println(var);
    }
}
