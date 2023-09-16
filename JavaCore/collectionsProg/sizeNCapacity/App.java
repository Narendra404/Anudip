package collectionsProg.sizeNCapacity;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // create list
        List<Integer> list = new ArrayList<>();

        // add elements
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        // display size of the list
        System.out.println();
        System.out.println("Size of the ArrayList : " + list.size());
        System.out.println();
    }
}
