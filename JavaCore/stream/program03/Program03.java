package stream.program03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program03 {
    public static void main(String[] args) {

        List<String> numbers = Arrays.asList("One", "Two", "Three");

        Optional<String> result = numbers.stream().reduce((append, str) -> {
            append = append + str;
            return append;
        });

//        Alternative (for reverse string) :
//        Optional<String> result = numbers.stream().reduce((append, str) -> str + append);

        System.out.println(result.get());
    }
}
