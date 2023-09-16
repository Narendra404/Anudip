package collectionsProg.basicUsage;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // create list
        List<Integer> list = new ArrayList<>();

        // add elements
        list.add(5);
        list.add(10);
        list.add(15);

        // display elements
        System.out.println();
        System.out.println("In list form : ");
        System.out.println(list);
        System.out.println();
        System.out.println("Not in list form : ");

        for (Integer var : list) System.out.println(var);
    }
}
