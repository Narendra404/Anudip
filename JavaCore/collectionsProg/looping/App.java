package collectionsProg.looping;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // create list initialized with doubles
        List<Double> list = new ArrayList<>(Arrays.asList(10.0, 20.0, 30.0));

        // declare variable to store sum
        Double sum = 0.0;

        // loop through elements to calculate sum
        for (Double element : list) sum += element;

        // display sum
        System.out.println();
        System.out.println("The sum of doubles : " + sum);
    }
}
