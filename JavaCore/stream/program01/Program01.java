package stream.program01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program01 {
    public static void main(String[] args) {

        // create a List of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        System.out.println(numbers);

        Stream<Integer> stream = numbers.stream();
        Stream<Integer> stream1 = stream.map(x -> x * x);
        List<Integer> squares = stream1.collect(Collectors.toList());
//        Alternative :
//        List<Integer> stream2 = stream1.toList();

        System.out.println(squares);
    }
}
